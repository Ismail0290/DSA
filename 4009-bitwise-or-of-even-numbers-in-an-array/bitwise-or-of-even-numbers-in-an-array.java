class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int bitwise_or = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] % 2 == 0) bitwise_or |= nums[i];
        }
        return bitwise_or;
    }
}