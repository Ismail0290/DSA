class Solution {
    public int myAtoi(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        boolean pos = true;
        long sum = 0;
        while(i<ch.length && ch[i] == ' '){
            i++;
        }
        if(i < ch.length && (ch[i] == '+' || ch[i] == '-')){
            if(ch[i] == '-') pos = false;
            i++;
        }
        while(i<ch.length && ch[i] >= '0' && ch[i] <= '9'){
            sum = sum*10 + ch[i]-'0';
            if(pos && sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(!pos && sum * -1 < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        // if(pos && sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        // if(!pos && sum * -1 < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(pos) return (int) sum;
        return (int) sum * -1;
    }
}