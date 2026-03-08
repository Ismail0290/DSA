class Solution {
    public int maximum69Number (int num) {
        int ans = 0;
        int rev = 0;
        int sol = 0;
        while(num > 0){
            int digit = num%10;
            rev = rev * 10 + digit;
            num/=10;
        }
        boolean once = true;
        while(rev > 0){
            int digit = rev%10;
            if(digit == 6 && once){
                ans = 10*ans + 9;
                once = false;
            }else{
                ans = ans*10 + digit;
            }
            rev /= 10;
        }
        return ans;
    }
}