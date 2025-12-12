class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int max = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > max) max = nums[i];
        }
        if(h == nums.length){
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
            if(sum > h){
                s = m+1;
            } else{
                e = m;
            }
        }
        return e;
    }
}