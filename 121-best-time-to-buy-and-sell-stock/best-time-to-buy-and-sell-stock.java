class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int sell = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i] > sell){
                sell = prices[i];
            }
            if(prices[i] < buy){
                buy = prices[i];
                sell = 0;
            }
            profit = Math.max(profit, sell - buy);
        }
        return profit;
    }
}