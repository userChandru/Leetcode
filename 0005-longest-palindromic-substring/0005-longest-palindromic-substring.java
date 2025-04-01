class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;
        String max = s.substring(0,1);
        for(int i = 0; i < s.length()-1; i++){
            String odd = helper(s, i, i);
            String eve = helper(s, i, i+1);
            if(odd.length() > max.length())
                max = odd;
            if(eve.length() > max.length())
                max = eve;
        }
        return max;
    }
    private String helper(String s, int right, int left){
        while(0 <= right && left < s.length() && s.charAt(right) == s.charAt(left)){
            right--;
            left++;
        }
        return s.substring(right+1, left);
    }
}