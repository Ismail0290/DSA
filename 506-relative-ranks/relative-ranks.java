class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = Arrays.copyOf(score, score.length);
        String[] ans = new String[score.length];
        Arrays.sort(score);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<score.length; i++){
            map.put(score[i], i);
        }
        for(int i = 0; i<arr.length; i++){
            if(map.get(arr[i]) == arr.length-1){
                ans[i] = "Gold Medal";
            }else if(map.get(arr[i]) == arr.length-2){
                ans[i] = "Silver Medal";
            }else if(map.get(arr[i]) == arr.length - 3){
                ans[i] = "Bronze Medal";
            }else{
                ans[i] = ""+(arr.length-map.get(arr[i]));
            }
        }
        return ans;
    }
}