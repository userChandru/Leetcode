int minCostClimbingStairs(int* cost, int costSize) {
        int dp[costSize + 1]; 
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < costSize; i++){
            dp[i] = cost[i] + fmin(dp[i - 1], dp[i - 2]);
        }
        return fmin(dp[costSize - 1], dp[costSize - 2]);
}