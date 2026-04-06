class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int count = 0;
        for(int value: map.values()){
            if(value > max){
                count = value;
                max = value;
            }else if(value == max){
                count+=max;
            }
        }
        return count;
    }
}