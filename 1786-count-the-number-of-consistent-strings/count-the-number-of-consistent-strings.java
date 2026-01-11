class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        //check if each char of allowed is in words or not.
        int count = 0;
        for(String s: words){
            boolean check = true;
            for(int i = 0; i < s.length(); i++){
                if(!allowed.contains(s.substring(i,i+1))){
                    check = false;
                    break;
                }
            }
            if(check == true) count++;
        }
        return count;
    }
}