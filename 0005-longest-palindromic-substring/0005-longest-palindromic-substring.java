class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
            return s;
        String maxString = s.substring(0,1);
        for(int i=0; i<s.length() -1; i++){
            String odd = helper(s, i, i);
            String even = helper(s, i, i+1);
            if(odd.length() > maxString.length())
                maxString = odd;
            if(even.length() > maxString.length())
                maxString = even;
        }
        return maxString;
    }
    private String helper(String s,int i, int j){
        while(i >= 0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1, j);
    }
}