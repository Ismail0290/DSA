class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(m-1 >= 0 && nums[m-1] < nums[m] && m+1 <= n-1 && nums[m+1] < nums[m]) return m;
            if(m-1 >= 0 && nums[m-1] > nums[m]){
                e = m-1;
            }else if(m+1 <= n-1 && nums[m+1] > nums[m]){
                s = m+1;
            }else if(m==0) return 0;
            else if(m == n-1) return n-1;
        }
        return s;
    }
}