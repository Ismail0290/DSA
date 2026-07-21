class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        for(String s: str1){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s: str2){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        map.forEach((key, value) -> {
            if(value == 1){
                ans.add(key);
            }
        });
        String[] sol = new String[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            sol[i] = ans.get(i);
        }
        return sol;
    }
}