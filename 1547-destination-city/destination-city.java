class Solution {
    public String destCity(List<List<String>> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i< list.size(); i++){
            for(int j = 0; j<2; j++){
                if(j == 0){
                    map.put(list.get(i).get(j), map.getOrDefault((list.get(i).get(j)), 0)+2);
                }
                else map.put(list.get(i).get(j), map.getOrDefault((list.get(i).get(j)), 0)+1);
            }
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return list.get(0).get(1);
    }
}