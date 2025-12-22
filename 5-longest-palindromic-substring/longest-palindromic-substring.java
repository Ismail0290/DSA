class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;

        String maxStr = s.substring(0,1);
        
        for(int i = 0; i< s.length(); i++){
            String odd = enhanceString(s, i, i);
            String even = enhanceString(s, i, i+1);

            if(odd.length() > even.length() && odd.length() > maxStr.length()){
                maxStr = odd;
            }else if(odd.length() < even.length() && even.length() > maxStr.length()){
                maxStr = even;
            }
            
        } 
        return maxStr;
    }
    static String enhanceString(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            r++;
            l--;
        }
        return s.substring(l+1, r);
    }
}