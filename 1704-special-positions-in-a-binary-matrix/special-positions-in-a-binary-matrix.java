class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(mat[i][j] == 1){
                    boolean check = false;
                    for(int a = 0; a<rows; a++){
                        if(a != i && mat[a][j] == 1){
                            check = true;
                            break;
                        }
                    }
                    if(check) continue;
                    for(int b = 0; b<cols; b++){
                        if(b != j && mat[i][b] == 1){
                            check = true;
                            break;
                        }
                    }
                    if(!check) count++;
                }
            }
        }
        return count;
    }
}