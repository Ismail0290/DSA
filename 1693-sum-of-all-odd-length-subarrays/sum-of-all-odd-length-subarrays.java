class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        // 1,3,5,7
        /*
        9
        012 123 234 345 456

         */
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            sum += (((i+1)*(n-i)+1)/2) * arr[i]; 
        }
        return sum;
    }
}