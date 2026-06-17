class Solution {
    public int[] findDegrees(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                ans[i] += matrix[j][i];
            }
        }
        return ans;
    }
}