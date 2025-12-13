class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int minc = 1;
        int maxc = 0;
        for(int i = 0; i<n; i++){
            minc = Math.max(minc, weights[i]);
            maxc += weights[i];
        }
        int ans = maxc;
        while(minc <= maxc){
            int m = minc + (maxc - minc)/2;
            int ms = m;
            int d = 1;
            for(int i = 0; i<n; i++){
                if(m - weights[i] >= 0){
                    m -= weights[i];
                }else{
                    m = ms;
                    d++;
                    i--;
                }
            }
            if(d > days) minc = ms+1;
            else{
                ans = ms;
                maxc = ms-1;
            }
        }
        return ans;
    }
}