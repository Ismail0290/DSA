class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length-1;
        while(l<r){
            // check if the l != r
            if(ch[l] > ch[r]){
                ch[l] = ch[r];
            }else if(ch[l] < ch[r]){
                ch[r] = ch[l];
            }
            l++;
            r--;
        }
        return new String(ch);
    }
}