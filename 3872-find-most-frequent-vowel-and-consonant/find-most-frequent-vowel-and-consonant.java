class Solution {
    public int maxFreqSum(String s) {
        int v = 0;
        int c = 0;
        int[] ch = new int[26];
        for(int i = 0; i<s.length(); i++){
            ch[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i<ch.length; i++){
            if(i == 0 || i == 'e' - 'a' || i == 'i' - 'a' || i == 'o' - 'a' || i == 'u' - 'a') {
                v = Math.max(v,ch[i]);
            }else{
                c = Math.max(c,ch[i]);
            }
        }
        return v + c;
    }
}