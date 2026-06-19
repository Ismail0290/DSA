class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countLessThanEqualK(nums, k) - countLessThanEqualK(nums, k-1);
    }
    static int countLessThanEqualK(int[] arr, int k){
        int l = 0;
        int r = 0;
        int count = 0;
        int ans = 0;
        while(r < arr.length){
            if(arr[r]%2 != 0){
                count++;
            }
            while(count > k){
                if(arr[l]%2 != 0){
                    count--;
                }
                l++;
            }
            ans += (r-l+1);
            r++;
        }
        return ans;
    }
}