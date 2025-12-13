class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long f = (long) m*k;
        if(f > bloomDay.length) return -1;
        int min = Integer.MAX_VALUE;
        int max = 1;
        for(int i = 0; i<bloomDay.length; i++){
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        while(min <= max){
            int mid = min + (max - min)/2;
            int count = 0;
            int b = 0;
            for(int i = 0; i< bloomDay.length; i++){
                if(bloomDay[i] <= mid) count++;
                else{
                    b += count/k;
                    count = 0;
                }
            }
            b += count/k;
            if(b < m) min = mid+1;
            else max = mid-1;
        }
        return min;     
    }
}