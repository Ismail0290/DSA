class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        String maxs = "";
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j< s.length(); j++){
                if(isPalindrome(s.substring(i,j+1))){
                    if(j-i+1 > max){
                        max = j-i+1;
                        maxs = s.substring(i,j+1);
                    }
                }
            }
        }
        return maxs;
    }
    static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}