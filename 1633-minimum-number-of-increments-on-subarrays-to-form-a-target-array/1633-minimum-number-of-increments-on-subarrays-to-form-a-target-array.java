class Solution {
    public int minNumberOperations(int[] target) {
        int ans = target[0];
        int n = target.length;
        for(int i=1; i<n; i++){
            int curr = target[i];
            int prev = target[i-1];
            if(curr<=prev)
                continue;
            else if(curr>prev)
                ans+=curr-prev;
        }
        return ans;
    }
}