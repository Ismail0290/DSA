class Solution {
    public int minTimeToType(String word) {
        char[] ch = word.toCharArray();
        int ans = ch.length;
        ans += Math.min(Math.abs(ch[0] - 'a'), 26 - Math.abs(ch[0] - 'a'));
        for(int i = 1; i<ch.length; i++){
            ans += Math.min(Math.abs(ch[i] - ch[i-1]), 26 - Math.abs(ch[i] - ch[i-1]));
        }
        return ans;
    }
}