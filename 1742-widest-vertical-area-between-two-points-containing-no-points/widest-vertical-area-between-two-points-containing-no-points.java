class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int size = points.length;
        int max_distance = 0;
        int[] and = new int[size];
        for(int i=0;i<size;i++){
            and[i] = points[i][0];
        }
        Arrays.sort(and);
        for(int i=0;i<size-1;i++){
            max_distance = Math.max(max_distance,and[i+1] - and[i]);
        }
        return max_distance;
    }
}