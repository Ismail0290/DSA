class Solution {
    public int mirrorDistance(int n) {
        int r=0;
        int a = n;
        while(n>0){
            int digit = n%10;
            r = digit + r*10;
            n/=10;
        }
        return Math.abs(a-r);
    }
}