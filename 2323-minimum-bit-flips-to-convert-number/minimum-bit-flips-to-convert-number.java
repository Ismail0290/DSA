class Solution {
    public int minBitFlips(int start, int goal) {
        String s1 = Integer.toBinaryString(start);
        String s2 = Integer.toBinaryString(goal);
        int l1 = s1.length();
        int l2 = s2.length();
        int count = 0;
        if(l1 > l2){
            for(int i = 0; i < l2; i++){
                if(s1.charAt(l1-i-1) != s2.charAt(l2-i-1)){
                    count++;
                }
            }
            for(int i = 0; i<l1-l2; i++){
                if(s1.charAt(i) == '1') count++;
            }
        }else{
            for(int i = 0; i < l1; i++){
                if(s2.charAt(l2-i-1) != s1.charAt(l1-i-1)){
                    count++;
                }
            }
            for(int i = 0; i<l2-l1; i++){
                if(s2.charAt(i) == '1') count++;
            }
        }
        return count;
    }
}