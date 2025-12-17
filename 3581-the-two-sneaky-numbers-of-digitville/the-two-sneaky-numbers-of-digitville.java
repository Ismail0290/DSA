class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int c = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                arr[c] = nums[i];
                c++;
            }else{
                map.put(nums[i], true);
            }
        }
        return arr;
    }
}