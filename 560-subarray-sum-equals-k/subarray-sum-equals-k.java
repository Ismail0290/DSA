class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] ps = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int i = 0; i<n; i++){
            sum += nums[i];
            ps[i] = sum;
            if(map.containsKey(ps[i] - k)){
                count += map.get(ps[i] - k);
            }
            map.put(ps[i], map.getOrDefault(ps[i], 0)+1);
        }
        return count;
    }
}