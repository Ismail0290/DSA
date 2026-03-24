class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        // 1,3,5,7
        /*
        9
        012 123 234 345 456

         */
        int sum = 0;
        for(int i = 1; i<=arr.length; i+=2){
            for(int j = 0; j<arr.length-i+1; j++){
                for(int k = j; k<j+i; k++){
                    sum += arr[k];
                }
            }
        }
        return sum;
    }
}