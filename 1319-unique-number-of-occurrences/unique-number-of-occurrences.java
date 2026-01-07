class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            //array traversal
            // freq 
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(Integer value : map.values()){
            if(!set.add(value)) return false;
        }
        return true;
    }
}