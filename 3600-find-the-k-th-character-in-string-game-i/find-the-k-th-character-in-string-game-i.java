class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        String append = "";
        while(k + 1 > word.length()){
            for(char c: word.toCharArray()){
                append += ""+(char)(c+1);
            }
            word += append;
            append = "";
        }
        return word.charAt(k-1);
    }
}