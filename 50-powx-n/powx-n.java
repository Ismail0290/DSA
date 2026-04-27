class Solution {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        if(n < 0){
            n = -n;
            x = 1.0/x;
        }
        double pow = 1;
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            }
            x *= x;
            n /= 2;
        }
        return pow;
    }
}