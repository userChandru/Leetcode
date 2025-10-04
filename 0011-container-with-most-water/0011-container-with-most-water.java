class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0, j=n-1;
        // int maxl[] = new int[n];
        // int maxr[] = new int[n];
        // int ans=0;
        // for(int i=0, max=0; i<n; i++){
        //     max = Math.max(max, height[i]);
        //     maxl[i] = max;
        // }
        // for(int i=0, max=0; i<n; i++){
        //     max = Math.max(max, height[i]);
        //     maxr[i] = max;
        // }
        int max=0;
        while(i<j){
            int a=height[i], b= height[j];
            int curr = Math.min(a, b);
            curr = curr * Math.abs(i-j);
            max = Math.max(max, curr);
            if(a<b)
                i++;
            else 
                j--;
        }
        return max;
    }
}