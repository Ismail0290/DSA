class Solution {
    public int countPoints(String rings) {
        int[] r = new int[10];
        int[] g = new int[10];
        int[] b = new int[10];
        int i = 0;
        int count = 0;
        char[] ch = rings.toCharArray();
        while(i<ch.length){
            if(ch[i] == 'R'){
                i++;
                r[ch[i]-'0'] = 1;
            }else if(ch[i] == 'G'){
                i++;
                g[ch[i]-'0'] = 1;
            }else{
                i++;
                b[ch[i]-'0'] = 1;
            }
            i++;
        }
        for(int j = 0; j<r.length; j++){
            if(r[j] == 1 && g[j] == 1 && b[j] == 1){
                count++;
            }
        }
        return count;
    }
}