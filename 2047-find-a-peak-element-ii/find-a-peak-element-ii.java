class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] arr = new int[m+2][n+2];
        for(int i = 0; i<m+2; i++){
            arr[i][0] = -1;
            arr[i][n+1] = -1;
        }
        for(int i = 1; i<n+1; i++){
            arr[0][i] = -1;
            arr[m+1][i] = -1;
        }
        for(int i = 1; i<m+1; i++){
            for(int j = 1; j<n+1; j++){
                arr[i][j] = mat[i-1][j-1];
            }
        }
        for(int i = 1; i<m+1; i++){
            for(int j = 1; j<n+1; j++){
                if(arr[i][j] > arr[i-1][j] &&
                   arr[i][j] > arr[i+1][j] &&
                   arr[i][j] > arr[i][j-1] &&
                   arr[i][j] > arr[i][j+1]){
                    return new int[] {i-1, j-1};
                   }
            }
        }
        return new int[] {m-1, n-1};
    }
}