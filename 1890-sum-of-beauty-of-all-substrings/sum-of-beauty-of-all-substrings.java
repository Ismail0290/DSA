class Solution {
    public int beautySum(String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<s.length(); j++){
                count += beauty(s.substring(i,j+1));
            }
        }
        return count;
    }
    static int beauty(String s){
        int min = Integer.MAX_VALUE;
        int max = 1;
        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 97]++;
        }
        for(int i = 0; i<freq.length; i++){
            if(freq[i] != 0){
                min = Math.min(min, freq[i]);
            }
            max = Math.max(max, freq[i]);

        }
        return max - min;
    }
}