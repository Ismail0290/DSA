class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return subarrayLessThanEqualToK(nums, goal) - subarrayLessThanEqualToK(nums, goal-1);
    }
    static int subarrayLessThanEqualToK(int[] arr, int k){
        if(k < 0) return 0;
        int l = 0;
        int r = 0;
        int count = 0;
        int sum = 0;
        while(r < arr.length){
            sum += arr[r];
            while(sum > k){
                sum -= arr[l];
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}