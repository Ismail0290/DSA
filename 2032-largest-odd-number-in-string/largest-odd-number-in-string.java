class Solution {
    public String largestOddNumber(String num) {
        char[] c = num.toCharArray();
        for(int i = c.length - 1; i >= 0; i--){
            if((c[i] - '0') % 2 != 0) return num.substring(0,i+1);
        }
        return "";
    }
}