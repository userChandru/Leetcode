class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long[] dp = new long[k];
        Arrays.fill(dp, (long) 1e15);
        dp[k - 1] = 0;
        long ans = (long) -1e15, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            ans = Math.max(ans, temp - dp[i % k]);
            dp[i % k] = Math.min(dp[i % k], temp);
        }
        return ans;
    }
}