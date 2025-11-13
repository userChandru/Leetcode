class Solution {
    public int maxOperations(String s) {
        int ones = 0;
        int ans = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1' || (i==n-1)){
                ans+=ones;
                ones++;
                while(i+1<n && s.charAt(i+1)=='1'){
                    ones++;
                    i++;
                }
            }
        }
        return ans;       
    }
}