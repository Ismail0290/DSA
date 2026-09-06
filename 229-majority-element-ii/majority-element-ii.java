class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int e1 = Integer.MIN_VALUE;
        int e2 = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(cnt1 == 0 && e2 != nums[i]){
                cnt1++;
                e1 = nums[i];
            }else if(cnt2 == 0 && e1 != nums[i]){
                cnt2++;
                e2 = nums[i];
            }else if(e1 == nums[i]){
                cnt1++;
            }else if(e2 == nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(e1 == nums[i]){
                cnt1++;
            }
            if(e2 == nums[i]){
                cnt2++;
            }
        }
        if(cnt1 > nums.length/3) list.add(e1);
        if(cnt2 > nums.length/3) list.add(e2);
        return list;
    }
}