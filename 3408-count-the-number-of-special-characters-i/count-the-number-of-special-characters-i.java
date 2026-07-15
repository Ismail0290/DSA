class Solution {
    public int numberOfSpecialChars(String word) {
        char[] ch = word.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i<ch.length; i++){
            set.add(ch[i]);
        }
        for(char c: set){
            if(set.contains((char) (c - 32))) count++;
        }
        return count;
    }
}