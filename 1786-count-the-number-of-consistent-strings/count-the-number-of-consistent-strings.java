class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        //check if each char of allowed is in words or not.
        int count = 0;
        boolean[] arr = new boolean[26];
        for(char c: allowed.toCharArray()){
            arr[c - 'a'] = true;
        }
        for(String s: words){
            boolean check = true;
            for(char c: s.toCharArray()){
                if(!arr[c - 'a']){
                    check = false;
                    break;
                }
            }
            if(check) count++;
        }
        return count;
    }
}