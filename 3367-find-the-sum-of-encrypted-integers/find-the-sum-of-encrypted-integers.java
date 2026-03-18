class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += encrypt(nums[i]);
        }
        return sum;   
    }
    static int encrypt(int sum){
        int a = sum;
        int ans = 0;
        int max = 0;
        while(sum > 0){
            max = Math.max(sum%10, max);
            sum /= 10;
        }
        while(a > 0){
            ans = ans*10 + max;
            a /= 10;
        }
        return ans;
    }
}