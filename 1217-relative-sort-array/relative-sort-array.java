class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr1.length; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        int k = 0;
        int[] ans = new int[arr1.length];
        for(int i = 0; i<arr2.length; i++){
            set.add(arr2[i]);
            for(int j = 0; j<map.getOrDefault(arr2[i],0); j++){
                ans[k++] = arr2[i];
            }
        }
        int[] remaining = new int[arr1.length-k+1];
        int r = 0;
        for(int i = 0; i<arr1.length; i++){
            if(!set.contains(arr1[i])){
                remaining[r++] = arr1[i];
            }
        }
        Arrays.sort(remaining);
        for(int i = k; i<arr1.length; i++){
            ans[i] = remaining[i-k+1];
        }
        return ans;
    }
}