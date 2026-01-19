class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int rows = mat.length;
        int cols = mat[0].length; 
        int[][] rowSum = new int[rows][cols];
        int[][] prefixSum = new int[rows][cols];

        // prefix sum for row
        for(int i = 0; i<rows; i++){
            rowSum[i][0] = mat[i][0];
            for(int j = 1; j<cols; j++){
                rowSum[i][j] = rowSum[i][j-1] + mat[i][j];
            }
        }

        // prefix sum for col
        for(int j = 0; j<cols; j++){
            prefixSum[0][j] = rowSum[0][j];
            for(int i = 1; i<rows; i++){
                prefixSum[i][j] = prefixSum[i-1][j] + rowSum[i][j];
            }
        } 

         for(int side = Math.min(rows,cols); side>= 1; side--){
            for(int i = 0; i<rows-side+1; i++){
                for(int j = 0; j<cols-side+1; j++){
                    int targetSum = prefixSum[i+side-1][j+side-1] - (j>0 ? prefixSum[i+side-1][j-1] : 0) - (i>0 ? prefixSum[i-1][j+side-1] : 0) + (i>0 && j>0 ? prefixSum[i-1][j-1] : 0);
                    if(targetSum <= threshold) return side;
                }
            }
         }
         return 0;
        
    }
}