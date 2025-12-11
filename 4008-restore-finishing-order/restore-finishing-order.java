class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        int[] ans = new int[friends.length];
        int c = 0;
        for(int i = 0; i<n; i++){
            if(bs(order[i],friends)){
                ans[c] = order[i];
                c++;
                if(c == friends.length) break;
            }
        }
        return ans;
    }
    static boolean bs(int num, int[] arr){
        int s = 0; 
        int e = arr.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m] == num) return true;
            if(num > arr[m]) s = m+1;
            else e = m-1;
        }
        return false;
    }
}