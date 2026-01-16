class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        long prod = -1;
        if(m == n) {
            prod = (long) (m-1) * (n-1);
            return (int) (prod % 1000000007);
        }
        int h = hFences.length;
        int v = vFences.length;
        int[] hf = new int[h+2];
        int[] vf = new int[v+2];
        hf[0] = 1;
        hf[h+1] = m;
        vf[0] = 1;
        vf[v+1] = n;
        for(int i = 0; i<h; i++){
            hf[i+1] = hFences[i];
        }
        for(int i = 0; i<v; i++){
            vf[i+1] = vFences[i];
        }
        Arrays.sort(hf);
        Arrays.sort(vf);
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<h+2; i++){
            for(int j = i+1; j<h+2; j++){
                set.add(hf[j] - hf[i]);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<v+2; i++){
            for(int j = i+1; j<v+2; j++){
                if(set.contains(vf[j] - vf[i])){
                    max = Math.max(max, vf[j] - vf[i]);
                }
            }
        }
        if(max == Integer.MIN_VALUE) return -1;
        prod = (long) max * max;
        return (int) (prod % 1000000007);
    }
}