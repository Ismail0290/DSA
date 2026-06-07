class Solution {
    public String frequencySort(String s) {
        int[][] arr = new int[75][2];
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            arr[ch-'0'][0] = ch;
            arr[ch-'0'][1]++;
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j][1] < arr[j+1][1]){
                    int[] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i][1] != 0){
                while(arr[i][1]-- > 0){
                    sb.append((char) arr[i][0]);
                }
            }else break;
        }
        return sb.toString();
    }
}