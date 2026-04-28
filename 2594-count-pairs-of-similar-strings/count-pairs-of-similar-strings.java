class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for(int i = 0; i<words.length; i++){
            for(int j = i+1; j<words.length; j++){
                if(getMask(words[i]) == getMask(words[j])) count++;
            }
        }
        return count;
    }
    static int getMask(String s){
        int mask = 0;
        for(char ch: s.toCharArray()){
            mask |= 1 << (ch-'a');
        }
        return mask;
    }
}