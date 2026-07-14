class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
            if(map.getOrDefault(ch,0) == 2){
                return ch;
            }
        }
        return 'a';
    }
}