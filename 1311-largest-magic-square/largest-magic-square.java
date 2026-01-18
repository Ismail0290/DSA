class Solution {
    public int largestMagicSquare(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] rowSum = new int[rows][cols];
        int[][] colSum = new int[rows][cols];

        // prefix sum for row
        for(int i = 0; i<rows; i++){
            rowSum[i][0] = grid[i][0];
            for(int j = 1; j<cols; j++){
                rowSum[i][j] = rowSum[i][j-1] + grid[i][j];
            }
        }

        // prefix sum for col
        for(int j = 0; j<cols; j++){
            colSum[0][j] = grid[0][j];
            for(int i = 1; i<rows; i++){
                colSum[i][j] = colSum[i-1][j] + grid[i][j];
            }
        }
        
        for(int side = Math.min(rows,cols); side>= 2; side--){
            for(int i = 0; i<rows-side+1; i++){
                for(int j = 0; j<cols-side+1; j++){
                    int targetSum = rowSum[i][j+side-1] - (j>0 ? rowSum[i][j-1] : 0);

                    boolean allSame = true;

                    for(int r = i+1; r < i+side; r++){
                        int rowS = rowSum[r][j+side-1] - (j>0 ? rowSum[r][j-1] : 0);
                        if(rowS != targetSum){
                            allSame = false;
                            break;
                        }
                    }

                    if(!allSame){
                        continue;
                    }

                    for(int c = j; c<j+side; c++){
                        int colS = colSum[i+side-1][c] - (i>0 ? colSum[i-1][c] : 0);
                        if(colS != targetSum){
                            allSame = false;
                            break;
                        }
                    }

                    if(!allSame){
                        continue;
                    }

                    int diag = 0;
                    int antiDiag = 0;
                    for(int k = 0; k<side; k++){
                        diag += grid[i+k][j+k];
                        antiDiag += grid[i+k][j+side-1-k];
                    }

                    if(diag == targetSum && antiDiag == targetSum){
                        return side;
                    }
                }
            }            
        }
        return 1;
    }
}