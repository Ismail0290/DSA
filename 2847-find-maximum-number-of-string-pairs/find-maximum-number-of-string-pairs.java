class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(String s: words){
            if(map.containsValue(s)) count++;
            else{
                sb.append(s);
                map.put(s, sb.reverse().toString());
                sb.setLength(0);
            }
        }
        return count;
    }
}