class Solution {
    public boolean isSubsequence(String s, String t) {
        int ls = 0;
        int lt = 0;
        while(ls < s.length() && lt < t.length()){
            if(s.charAt(ls) == t.charAt(lt)){
                ls++;
                lt++;
            }else{
                lt++;
            }
        }
        return ls == s.length();
    }
}