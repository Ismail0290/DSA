class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int i;
        int[] ans = new int[2*n];
        for(i = 0; i < n; i++){
            ans[i] = nums[i];
        }
        for(i = 0; i<n; i++){
            ans[n+i] = nums[n-i-1];
        }
        return ans;
    }
}