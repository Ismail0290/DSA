class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for(int i = 0; i<boxes.length(); i++){
            for(int j = i-1; j>=0; j--){
                if(boxes.charAt(j) == '1'){
                    ans[i] += (i-j);
                }
            }
            for(int j = i+1; j<boxes.length(); j++){
                if(boxes.charAt(j) == '1'){
                    ans[i] += (j-i);
                }
            }
        }
        return ans;
    }
}