class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum++;
            HashSet<Integer> set = new HashSet<>();
            set.add(nums.get(i));
            for(int j = i+1; j<n; j++){
                set.add(nums.get(j));
                sum += (set.size() * set.size());
            }
        }
        return sum;
    }
}