int climbStairs(int n) {
    int ans[n+1];
    ans[0]=ans[1]=1;
    for(int i=2; i<=n; i++)
        ans[i]= ans[i-1] + ans[i-2];
    return ans[n];
}