class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];
        if(k>0){
            for(int i = 0; i<n; i++){
                int sum = 0;
                for(int j = 0; j<k; j++){
                    sum += code[(i+j+1)%n];
                }
                arr[i] = sum;
            }
        }else if(k < 0){
            for(int i = 0; i<n; i++){
                int sum = 0;
                for(int j = 0; j<k*-1; j++){
                    sum += code[(i-j-1+n)%n];
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}