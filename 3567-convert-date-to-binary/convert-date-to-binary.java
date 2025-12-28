class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        StringBuilder sb = new StringBuilder();
        int check = 2;
        // convert each string to number
        for(String a: arr){
            int b = Integer.parseInt(a);
            // convert integer to binary
            sb.append(Integer.toBinaryString(b));
            if(check > 0){
                sb.append("-");
                check--;
            }
        }
        return sb.toString();
    }
}