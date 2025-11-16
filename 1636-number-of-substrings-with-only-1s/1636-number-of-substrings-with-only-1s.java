class Solution{
    public static int numSub(String s) {
        int ones = 0 ;
        int ans = 0;
        for(char ch : s.toCharArray())
            if (ch  == '1')
                ans = (ans + ++ones) % 1000000007 ;
            else    
                ones = 0 ;
        return ans;
    }
}