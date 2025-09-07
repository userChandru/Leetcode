class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        for(int i=0; i<(n+1)/2; i++){
            ans[i] = -1 * ((n/2) - i);
            ans[n-i-1] = n/2 - i;
        }
        return ans;
    }
}