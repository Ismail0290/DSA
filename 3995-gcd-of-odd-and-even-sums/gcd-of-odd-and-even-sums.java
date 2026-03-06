class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 1; i<=n; i++){
            sumEven += i*2;
            sumOdd += i*2 + 1;
        }
        return gcd(sumEven, sumOdd);
    }
    static int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}