class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        return helper(num, step);
    }
    static int helper(int n, int step){
        if(n == 0) return step;
        if(n % 2 == 0) return helper(n/2, step+1);
        return helper(n-1, step+1);
    }
}