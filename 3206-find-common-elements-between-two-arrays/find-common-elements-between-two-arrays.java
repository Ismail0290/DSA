class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] ans = new int[2];
        for(int i = 0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i<nums2.length; i++){
            set2.add(nums2[i]);
            
        }
        for(int i = 0; i<nums1.length; i++){
            if(set2.contains(nums1[i])) ans[0]++;
        }
        for(int i = 0; i<nums2.length; i++){
            if(set1.contains(nums2[i])) ans[1]++;
        }
        return ans;
    }
}