class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        ArrayList<String> al = new ArrayList<>();
        boolean check = true;
        for(String s: words){
            String sx = s.toLowerCase();
            if(s.length() == 1){
                al.add(s);
            }
            else if(s1.indexOf(sx.charAt(0)) != -1){
                for(int i = 1; i<s.length(); i++){
                    if(s1.indexOf(sx.charAt(i)) == -1){
                        check = false;
                        break;
                    }
                    check = true;
                }
                if(check == true){
                    al.add(s);
                }
            }else if(s2.indexOf(sx.charAt(0)) != -1){
                for(int i = 1; i<s.length(); i++){
                    if(s2.indexOf(sx.charAt(i)) == -1){
                        check = false;
                        break;
                    }
                    check = true;
                }
                if(check == true){
                    al.add(s);
                }
            }else{
                for(int i = 1; i<s.length(); i++){
                    if(s3.indexOf(sx.charAt(i)) == -1){
                        check = false;
                        break;
                    }
                    check = true;
                }
                if(check == true){
                    al.add(s);
                }
            }
        }
        String[] ans = new String[al.size()];
        return al.toArray(ans);
    }
}