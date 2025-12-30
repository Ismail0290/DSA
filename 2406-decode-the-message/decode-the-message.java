class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int check = 0;
        for(int i = 0; i<key.length(); i++){
            if(key.charAt(i) >= 'a' && key.charAt(i) <='z' && map.getOrDefault(key.charAt(i), '1') == '1'){
                map.put(key.charAt(i), (char)('a' + check));
                check++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<message.length(); i++){
            if(message.charAt(i) >= 'a' && message.charAt(i) <='z'){
                sb.append(map.get(message.charAt(i)));
            }else{
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
    }
}