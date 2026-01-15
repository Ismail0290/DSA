class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        for(int i=0; i<points.length-1; i++){
            max = Math.max(max, points[i+1][0] - points[i][0]);
                
        }
        return max;
    }
}