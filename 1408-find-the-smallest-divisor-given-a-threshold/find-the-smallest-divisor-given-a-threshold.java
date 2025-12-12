class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > max) max = nums[i];
        }
        if(threshold == nums.length){
            return max;
        }
        int s = 1;
        int e = max;
        while(s<e){
            int m = s + (e-s)/2;
            int sum = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i] % m == 0) sum += (nums[i]/m);
                else sum += (nums[i]/m) + 1;
            }
            if(sum > threshold){
                s = m+1;
            } else{
                e = m;
            }
        }
        return e;
    }
}