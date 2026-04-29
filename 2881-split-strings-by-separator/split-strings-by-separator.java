class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        String s = String.valueOf(separator);
        for(int i=0; i<words.size(); i++) {
            String[] res = words.get(i).split("\\" + s);
            for(int j=0; j<res.length; j++) {
                if(res[j].length()!=0) {
                    ans.add(res[j]);
                }
            }
        }
        return ans;
    }
}