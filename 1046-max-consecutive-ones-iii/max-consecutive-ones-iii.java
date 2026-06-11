class Solution {
    public int longestOnes(int[] nums, int k) {
        int right = 0;
        int left = 0;
        int n = nums.length;
        int flip = k;
        int max = 0;
        while(left < n && right < n){
            if(nums[right] == 1){
                right++;
            }else if(flip > 0){
                right++;
                flip--;
            }else{
                max = Math.max(max, right - left);
                if(nums[left] == 0 && flip+1 <= k){
                    flip++;
                }
                left++;
                if(left > right) right = left;
            }
        }
        return Math.max(max, right-left);
    }
}