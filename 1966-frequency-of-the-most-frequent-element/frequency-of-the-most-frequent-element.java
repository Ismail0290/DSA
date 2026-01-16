class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = 0;
        long total = 0;
        int max = 1;
        while(r<nums.length){
            total += (long) nums[r];

            while((long) nums[r] * (r-l+1) > total + k){
                total -= (long) nums[l];
                l++;
            }

            max = Math.max(max, r-l+1);
            r++;
        }

        return max;
    }
}