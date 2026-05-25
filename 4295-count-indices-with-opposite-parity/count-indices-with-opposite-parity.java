class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int count = 0;
            if(nums[i] % 2 == 0){
                for(int j = i+1; j<n; j++){
                    if(nums[j] % 2 != 0) count++;
                }
                nums[i] = count;
            }else{
                for(int j = i+1; j<n; j++){
                    if(nums[j] % 2 == 0) count++;
                }
                nums[i] = count;
            }
        }
        return nums;
    }
}