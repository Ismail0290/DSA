class Solution {
    public String destCity(List<List<String>> list) {
        List<String> ans = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            ans.add(list.get(i).get(0));
        }
        for(int i = 0; i<list.size(); i++){
            if(!ans.contains(list.get(i).get(1))) return list.get(i).get(1);
        }
        return null;
    }
}