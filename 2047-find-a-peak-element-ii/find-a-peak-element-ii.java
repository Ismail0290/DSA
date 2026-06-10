class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = high + (low - high)/2;
            int row = maxElement(mat, mid, m);
            int left = mid-1 >= 0 ? mat[row][mid-1] : -1;
            int right = mid+1 < n ? mat[row][mid+1] : -1;
            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[] {row, mid};
            }else if(mat[row][mid] < left){
                high = mid-1;
            }else if(mat[row][mid] < right){
                low = mid+1;
            }
        }
        return new int[] {m-1, n-1};
    }

    static int maxElement(int[][] arr, int col, int row){
        int max = 0;
        int maxi = 0;
        for(int i = 0; i<row; i++){
            if(arr[i][col] > max){
                max = arr[i][col];
                maxi = i;
            }
        }
        return maxi;
    }
}