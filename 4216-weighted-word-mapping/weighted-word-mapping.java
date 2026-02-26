class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String s: words){
            int sum = 0;
            for(int i = 0; i<s.length(); i++){
                sum += weights[s.charAt(i)-'a'];
            }
            sb.append((char)(25-(sum%26)+'a'));
        }
        return sb.toString();
    }
}