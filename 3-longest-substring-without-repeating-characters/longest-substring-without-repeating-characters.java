class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int r = 0; r<n; r++){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                l = Math.max(l, map.get(c) + 1);
            }
            map.put(c, r);
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}