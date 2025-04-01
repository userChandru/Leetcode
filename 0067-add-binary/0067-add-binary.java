class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int rem = 0;
        int i = a.length()-1, j = b.length()-1;
        while(i >= 0 || j >= 0 || rem == 1){
            if(0 <= i)
                rem += a.charAt(i--) - '0';
            if(0 <= j)
                rem += b.charAt(j--) - '0';
            ans.append(rem % 2);
            rem /= 2;
        }
        return ans.reverse().toString();
    }
}