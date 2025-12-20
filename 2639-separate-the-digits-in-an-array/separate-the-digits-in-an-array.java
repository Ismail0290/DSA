class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]/10 == 0) list.add(nums[i]);
            else {
                String s = "" + nums[i];
                for(int j = 0; j<s.length(); j++){
                    list.add(s.charAt(j) - '0');
                }  
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}