class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int s = 0;
        int e = n-1;
        while(s <= e){
            if(s==e) return nums[s];
            int m = s + (e-s)/2;
            if(m-1 >= 0 && m+1 <= n-1 && nums[m-1] < nums[m] && nums[m] < nums[m+1]) return nums[m];
            if(m%2 != 0 ){
                if(m-1 >= 0 && nums[m-1] == nums[m]){
                    s = m + 1;
                    continue;
                }else{
                    e = m - 1;
                    continue;
                }
            }else{
                if((m-1 >= 0 && nums[m-1] < nums[m]) || (m+1 <= n-1 && nums[m] == nums[m+1])){
                    s = m+1;
                    continue;
                }else{
                    e = m-1;
                }
            }
        }
        return nums[s];
    }
}