class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ls = new int[n];
        int[] rs = new int[n];
        int[] arr = new int[n];
        for(int i = 1; i<n; i++){
            ls[i] += ls[i-1] + nums[i-1];
            rs[n-1-i] += rs[n-i] + nums[n-i];
        }
        for(int i = 0; i<n; i++){
            arr[i] = Math.abs(rs[i] - ls[i]);
        }
        return arr;   
    }
}