class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.deleteCharAt(sb.length()-1);
            }else{
                break;
            }
        }
        return sb.toString();
    }
}