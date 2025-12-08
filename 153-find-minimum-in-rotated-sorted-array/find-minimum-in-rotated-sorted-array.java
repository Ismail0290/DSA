class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(nums[0] < nums[n-1]) return nums[0];
        int s = 0;
        int e = n-1;
        while(s<=e){
            int m = s + (e - s)/2;
            if(m-1 >= 0 && nums[m-1] > nums[m]) return nums[m];
            if(m+1 <= n-1 && nums[m] > nums[m+1]) return nums[m+1];
            if(nums[m] > nums[n-1]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return nums[s];
    }
}