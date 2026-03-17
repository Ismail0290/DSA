class Solution {
    public long removeZeros(long n) {
        // reverse n
        long rev = reverse(n);
        // sum of reverse
        long sum = 0;
        while(rev > 0){
            if(rev%10 != 0){
                sum = sum * 10 + rev%10;
            }
            rev /= 10;
        }
        return sum;
        // 300201 1-> 1*10+
    }
    static long reverse(long n){
        long sum = 0;
        while(n>0){
            sum = sum * 10 + n%10;
            n /= 10;
        }
        return sum;
    }
}