class Solution {
    public int maxOperations(String s) {
        int ones = 0;
        int ans = 0;
        int n = s.length();
        char arr[] = s.toCharArray();
        for(int i=0; i<n; i++){
            if(arr[i]=='1' || (i==n-1)){
                ans+=ones;
                ones++;
                while(i+1<n && arr[i+1]=='1'){
                    ones++;
                    i++;
                }
            }
        }
        return ans;       
    }
}