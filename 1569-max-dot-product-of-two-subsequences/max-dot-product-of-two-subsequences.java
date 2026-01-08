class Solution {
    Integer[][] dp;
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        dp = new Integer[m][n];
        return solve(0,0, nums1, nums2);
    }
    public int solve(int i, int j, int[] nums1, int[] nums2){
        if(i>=nums1.length || j>= nums2.length) return Integer.MIN_VALUE;
        if(dp[i][j] != null) return dp[i][j];
        int prod = nums1[i] * nums2[j];
        int include = prod + Math.max(0, solve(i+1, j+1, nums1, nums2));
        int exclude1 = solve(i+1, j, nums1, nums2);
        int exclude2 = solve(i, j+1, nums1, nums2);
        return dp[i][j] = Math.max(include, Math.max(exclude1, exclude2));
    }
}