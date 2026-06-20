class Solution {
    public int numberOfSubstrings(String s) {
        long n = s.length();
        long ans = n*(n+1)/2 - noOccurenceOfabc(s);
        return (int) ans;
    }
    static long noOccurenceOfabc(String s){
        int l = 0;
        int r = 0;
        long count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r < s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
            while(map.getOrDefault('a', 0) > 0 && map.getOrDefault('b', 0) > 0 && map.getOrDefault('c', 0) > 0){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
}
