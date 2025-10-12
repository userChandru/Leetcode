import java.util.*;

class Solution {
    int MOD = 1000000007, MAX = 31;
    long[] fact = new long[MAX], invFact = new long[MAX];

    public long modPow(long a, int b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }

    public int magicalSum(int m, int k, int[] nums) {

        fact[0] = 1;
        for (int i = 1; i < MAX; i++) 
            fact[i] = fact[i - 1] * i % MOD;

        invFact[MAX - 1] = modPow(fact[MAX - 1], MOD - 2);
        
        for (int i = MAX - 1; i > 0; i--) 
            invFact[i - 1] = invFact[i] * i % MOD;

        int n = nums.length;
        long[][] pw = new long[n][m + 1];
        for (int i = 0; i < n; i++) {
            pw[i][0] = 1;
            for (int j = 1; j <= m; j++) pw[i][j] = pw[i][j - 1] * nums[i] % MOD;
        }

        long[][][][] dp = new long[n + 1][m + 1][m / 2 + 2][k + 1];
        for (long[][][] a : dp)
            for (long[][] b : a)
                for (long[] c : b)
                    Arrays.fill(c, -1);

        long res = dfs(0, m, 0, k, pw, dp);
        return (int) (res * fact[m] % MOD);
    }

    public long dfs(int idx, int left, int carry, int bits, long[][] pw, long[][][][] dp) {
        int ones = Integer.bitCount(carry);
        if (ones + left < bits) return 0;
        if (idx == pw.length) return (left == 0 && ones == bits) ? 1 : 0;
        if (dp[idx][left][carry][bits] != -1) return dp[idx][left][carry][bits];

        long ans = 0;
        for (int j = 0; j <= left; j++) {
            int bit = (carry + j) & 1;
            if (bit <= bits) {
                long next = dfs(idx + 1, left - j, (carry + j) >> 1, bits - bit, pw, dp);
                ans = (ans + next * pw[idx][j] % MOD * invFact[j]) % MOD;
            }
        }
        return dp[idx][left][carry][bits] = ans;
    }
}
