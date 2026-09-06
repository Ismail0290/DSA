class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        freq.forEach((key, value) -> {
            if(value > nums.length/3){
                list.add(key);
            }
        });
        return list;
    }
}