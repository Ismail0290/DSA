class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0; i<k; i++){
            int minIndex = findMin(nums);
            nums[minIndex] *= multiplier;
        } 
        return nums;  
    }
    static int findMin(int[] nums){
        int minI = 0;
        int min = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
                minI = i;
            }
        }
        return minI;
    }
}