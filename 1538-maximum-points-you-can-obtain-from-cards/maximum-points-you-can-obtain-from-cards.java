class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int max = 0;
        int end = n-1;
        for(int i = 0; i<k; i++){
            sum += cardPoints[i];
        }
        max = sum;
        while(k > 0){
            sum = sum + cardPoints[end--] - cardPoints[--k];
            max = Math.max(sum, max);
        }

        return max;
    }
}