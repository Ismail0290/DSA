class Solution {
    public int commonFactors(int a, int b) {
        int n = gcd(a,b);
        int count = 0;
        for(int i=1; i<=n; i++){
            if(a%i == 0 && b%i == 0){
                count++;
            }
        }
        return count;
    }
    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}