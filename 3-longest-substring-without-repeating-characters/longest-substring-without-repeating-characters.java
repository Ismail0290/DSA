class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            boolean check = true;
            for(int j = i; j<s.length(); j++){
                if(set.contains(s.charAt(j))){
                    check = false;
                    max = Math.max(max, set.size());
                    set.clear();
                    break;
                }
                set.add(s.charAt(j));
            }
            if(check){
                return Math.max(max, s.length() - i);
            }
        }
        return max;
    }
}