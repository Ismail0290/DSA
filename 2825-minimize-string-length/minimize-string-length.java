class Solution {
    public int minimizedStringLength(String s) {
        int[] freq = new int[26];
        int count = 0;
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int f: freq){
            if(f>0){
                count++;
            }
        }
        return count;
    }
}