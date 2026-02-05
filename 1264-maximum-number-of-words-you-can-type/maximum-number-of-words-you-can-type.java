class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] parts = text.split(" ");
        int count = 0;
        for(String s : parts){
            boolean check = true;
            for(int i = 0; i<brokenLetters.length(); i++){
                if(s.indexOf(brokenLetters.charAt(i)) != -1){
                    check = false;
                    break;
                }
            }
            if(check) count++;
        }
        return count;
    }
}