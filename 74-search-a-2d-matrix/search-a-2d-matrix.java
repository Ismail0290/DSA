class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(matrix[mid][n-1] == target) return true;
            else if(matrix[mid][n-1] < target){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(matrix[end][mid] == target) return true;
            else if(matrix[end][mid] > target){
                high = mid-1;

            }else{
                low = mid+1;
            }
        }
        return false;
    }
}