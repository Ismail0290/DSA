class Solution {
    public int sumBase(int n, int k) {
        String baseN = Integer.toString(n, k);
        int sum = 0;
        for(int i = 0; i<baseN.length(); i++){
            sum += baseN.charAt(i) - '0';
        }
        return sum;
    }
}