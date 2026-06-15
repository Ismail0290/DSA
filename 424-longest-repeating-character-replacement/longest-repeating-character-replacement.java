class Solution {
    public int characterReplacement(String s, int k) {
        int right = 0;
        int left = 0;
        int n = s.length();
        int max = 0;
        int ans = 1;
        int[] freq = new int[26];
        while(right < n){
            freq[s.charAt(right)-'A']++;
            max = Math.max(freq[s.charAt(right) - 'A'], max);
            if((right - left + 1) - max > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            if((right - left + 1) - max <= k){
                ans = Math.max(right - left + 1, ans);
                right++;
            }
        }
        return ans;
    }
}