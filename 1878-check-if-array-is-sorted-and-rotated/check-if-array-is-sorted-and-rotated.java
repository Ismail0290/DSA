class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int x = 0; x<n; x++){
            for(int i = 0; i<n; i++){
                arr[i] = nums[(i+x) % n];
            }
            if(isSorted(arr)) return true;
        }
        return false;

        // if(nums[0] <= nums[nums.length-1]){
        //     for(int i = 0; i<nums.length-1; i++){
        //         if(nums[i] > nums[i+1]) return false;
        //     }
        //     return true;
        // }
        // for(int i = 0; i<nums.length-1; i++){
        //     boolean peaked = false;
        //     if(nums[i] > nums[i+1]){
        //         if(peaked) return false;
        //         peaked = true;
        //     }
        // }
        // return true;
    }
    static boolean isSorted(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}