class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return gcd(min, max);
    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }else{
            return gcd(b%a,a);
        }
    }
}