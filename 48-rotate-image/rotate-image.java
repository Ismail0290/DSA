class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
// n x n
// 0,0 -> 0,n
// 0,n -> n,n
// n,0 -> 0,0
// n,n -> n,0
// 0,1 -> 1,n
// 1,0 -> 0,1
// 1,1 -> 1,1/1,2 