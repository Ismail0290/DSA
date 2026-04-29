import java.util.*;
import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<words.size(); i++){
            String[] arr = words.get(i).split(Pattern.quote(""+separator));
            for(String s: arr){
                if(!s.isEmpty()){
                    list.add(s);
                }
            }
        }
        return list;
    }
}