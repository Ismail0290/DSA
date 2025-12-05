class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(String s: operations){
            if(s.contains("+")) count++;
            else count--;
        }
        return count;
    }
}