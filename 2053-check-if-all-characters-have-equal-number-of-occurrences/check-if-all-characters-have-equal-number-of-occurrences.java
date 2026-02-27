class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }
        int expected = 0;
        for(int i: arr){
            if(i != 0){
                expected = i;
                break;
            }
        }
        for(int i: arr){
            if(i != 0 && i != expected){
                return false;
            }
        }
        return true;
    }
}