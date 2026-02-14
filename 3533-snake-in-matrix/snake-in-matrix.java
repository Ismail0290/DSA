class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = (i*n) + j;
            }
        }
        int i = 0;
        int j = 0;
        for(int k = 0; k<commands.size(); k++){
            if(commands.get(k).equals("RIGHT")) j++;
            else if(commands.get(k).equals("DOWN")) i++;
            else if(commands.get(k).equals("UP")) i--;
            else j--;
        }
        return arr[i][j];
    }
}