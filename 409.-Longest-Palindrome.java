class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){return 1;}
        int pairs = 0;
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char ch:arr){
            if(set.contains(ch)){
                pairs++;
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        if(pairs*2 < s.length()){
            return pairs*2+1;
        }else{return pairs*2;}
    }
}