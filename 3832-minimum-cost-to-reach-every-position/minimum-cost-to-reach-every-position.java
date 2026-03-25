class Solution {
    public int[] minCosts(int[] cost) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<cost.length; i++){
            if(cost[i] < min){
                min = cost[i];
            }else{
                cost[i] = min;
            }
        }
        return cost;
    }
}