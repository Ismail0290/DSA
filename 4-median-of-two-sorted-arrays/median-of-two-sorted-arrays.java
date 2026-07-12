class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int first = 0;
        int second = 0;
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;
        while(first < nums1.length && second < nums2.length){
            if(nums1[first] < nums2[second]){
                arr[k] = nums1[first];
                first++;
            }else{
                arr[k] = nums2[second];
                second++;
            }
            k++;
        }
        while(first < nums1.length){
            arr[k] = nums1[first];
            k++;
            first++;
        }
        while(second < nums2.length){
            arr[k] = nums2[second];
            k++;
            second++;
        }
        int n = arr.length/2;
        double ans = 0.0;
        if(arr.length % 2 == 0){
            ans = (double) (arr[n-1] + arr[n])/2;
        }else{
            ans = arr[n];
        }
        return ans;
    }
}