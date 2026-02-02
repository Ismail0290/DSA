class Solution {
    public int maximumCount(int[] nums) {
        int countm = 0;
        int countp = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] < 0) countm++;
            else if(nums[i] > 0) countp++;
        }
        return Math.max(countm, countp);
    }
}