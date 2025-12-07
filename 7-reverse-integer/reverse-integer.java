class Solution {
    public int reverse(int x) {
        long reverse = 0;
        while(x > 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        while(x < 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return checkInt(reverse);
    }
    static int checkInt(long n){
        if(n<=Integer.MAX_VALUE && n>= Integer.MIN_VALUE) return (int) n;
        else return 0;
    }
}