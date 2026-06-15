class Solution {
    public int characterReplacement(String s, int k) {
        int right = 0;
        int left = 0;
        int n = s.length();
        int max = 0;
        int ans = 1;
        char maxChar = 'A';
        HashMap<Character, Integer> map = new HashMap<>();
        boolean changeRight = true;
        while(left < n && right < n && left <= right){
            if(changeRight){
                map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            }
            if(map.get(s.charAt(right)) > max){
                max = map.get(s.charAt(right));
                maxChar = s.charAt(right);
            }
            if(k >= right-left+1-max){
                ans = Math.max(right-left+1, ans);
                right++;
                changeRight = true;
            }else{
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                max = 0;
                for(int freq : map.values()){
                    max = Math.max(max, freq);
                }
                left++;
                changeRight = false;
            }
        }
        return ans;
    }
}