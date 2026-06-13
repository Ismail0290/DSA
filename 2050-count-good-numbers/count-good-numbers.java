class Solution {
    public int countGoodNumbers(long n) {
        long even = n/2 + n%2;
        long odd = n/2;
        return (int) ((power(4, odd) * power(5, even)) % 1000000007);
    }
    static long power(int x, long p){
        if(p == 0) return 1;
        long ans = power(x, p/2);
        ans *= ans; 
        ans %= 1000000007;
        if(p%2 != 0) {
            ans *= x;
            ans %= 1000000007;
        }
        return ans;
    }
}