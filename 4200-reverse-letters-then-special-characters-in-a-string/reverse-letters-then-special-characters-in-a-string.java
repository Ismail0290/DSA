class Solution {
    public String reverseByType(String s) {
        int n = s.length();

        StringBuilder builder = new StringBuilder();

        int spec = n - 1;
        int lett = n - 1;

        for (int i=0; i<n; i++) {
            char current = s.charAt(i);
            if (current >= 'a' && current <= 'z') {
                while (!(s.charAt(spec) >= 'a' && s.charAt(spec) <= 'z')) {
                    spec--;
                }
                builder.append(s.charAt(spec));
                spec--;
            } else {
                while (s.charAt(lett) >= 'a' && s.charAt(lett) <= 'z') {
                    lett--;
                }
                builder.append(s.charAt(lett));
                lett--;
            }
        }

        return builder.toString();
    }
}