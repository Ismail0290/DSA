class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            // if the element occurs twice return it. 
            if(set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }
        return nums[nums.length-1];
    }
}