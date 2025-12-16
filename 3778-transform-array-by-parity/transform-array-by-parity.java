class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                ans[l] = 0;
                l++;
            }else{
                ans[r] = 1;
                r--;
            }
        }
        return ans;
    }
}