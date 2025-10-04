class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int ans=0;
        int maxl[] = new int [n];
        int maxr[] = new int [n];
        for(int i=0, max=0; i<n; i++){
            max = Math.max(max, height[i]);
            maxl[i] = max;
        }
        for(int i=n-1, max=0; i>=0; i--){
            max = Math.max(max, height[i]);
            maxr[i] = max;
        }
        for(int i=0;i<n;i++){
            int min = Math.min(maxl[i], maxr[i]);
            ans+=min-height[i];
        }
        return ans;
    }
}