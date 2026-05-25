class Solution 
{
    public int[] countOppositeParity(int[] nums) 
    {
        int n = nums.length;
        int[] answer = new int[n];
        int evens = 0;
        int odds = 0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]%2==0){
                answer[i]=odds;
                evens++;
            } else {
                answer[i]=evens;
                odds++;
            }
        }
        return answer;
    }
}