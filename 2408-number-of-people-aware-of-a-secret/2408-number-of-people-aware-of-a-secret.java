class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int mod = 1000000007;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        long count = 0, ans = 0;

        for (int i = 2; i <= n; i++) {
            if (i > delay)
                count = (count + dp[i - delay]) % mod;
            if (i > forget)
                count = (count - dp[i - forget] + mod) % mod;
            dp[i] = count;
        }

        for (int i = n - forget + 1; i <= n; i++)
            if (i >= 1)
                ans = (ans + dp[i]) % mod;

        return (int) ans;
    }
}
