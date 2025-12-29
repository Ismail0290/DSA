class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        int i = 0;
        while(i< s.length()-1){ 
            int s1 = s.charAt(i);
            int s2 = s.charAt(i+1);
            score += Math.abs(s1-s2);
            i++;
        } 

        return score;
    }
}