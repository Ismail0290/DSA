class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String s: words){
            for(int i = 0; i<s.length(); i++){
                sb.append(m[s.charAt(i) - 'a']);
            }
            set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }
}