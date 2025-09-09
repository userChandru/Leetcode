class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int mod = 1000000007;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        long peopleSharing = 0, result = 0;

        for (int day = 2; day <= n; day++) {
            if (day - delay >= 1)
                peopleSharing = (peopleSharing + dp[day - delay]) % mod;
            if (day - forget >= 1) 
                peopleSharing = (peopleSharing - dp[day - forget] + mod) % mod;
            dp[day] = peopleSharing;
        }

        for (int day = n - forget + 1; day <= n; day++)
            if (day >= 1)
                result = (result + dp[day]) % mod;


        return (int) result;
    }
}
