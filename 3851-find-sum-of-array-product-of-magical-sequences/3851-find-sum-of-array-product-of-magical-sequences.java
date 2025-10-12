class Solution {
    int MOD = 1_000_000_007;

    int[][] comb;
    Integer[][][][] dp;
    int[] nums;
    int n;

    public int magicalSum(int m, int k, int[] numbers) {
        n = numbers.length;
        nums = numbers;
        comb = comb(m, m);
        dp = new Integer[m + 1][k + 1][n][m + 1];
        return dp(m, k, 0, 0);
    }

    private int dp(int m, int k, int i, int carry) {
        if (m < 0 || k < 0) return 0;
        if (i == n) 
            return (m == 0 && k - Integer.bitCount(carry) == 0) ? 1 : 0;

        if(dp[m][k][i][carry] != null) 
            return dp[m][k][i][carry];
        
        int res = 0;
        for(int count = 0; count <= m; count++) {
            int newM = m - count;
            int temp = carry + count;
            int newK = k - temp % 2;
            int newCarry = temp / 2;
            int sub = dp(newM, newK, i + 1, newCarry);
            if(sub == 0) 
                continue;
            int adding = mult(comb[m][count], modPow(nums[i], count));
            res = add(res, mult(sub, adding));
        }
        return dp[m][k][i][carry] = res;
    }

    private int[][] comb(int a, int b) {
        int[][] comb = new int[a + 1][b + 1];
        comb[0][0] = 1;
        for(int i = 1; i <= a; i++) {
            for(int j = 0; j <= b; j++) {
                if(j == 0) {
                    comb[i][0] = 1;
                    continue;
                }
                comb[i][j] = add(comb[i - 1][j - 1], comb[i - 1][j]);
            }
        }
        return comb;
    }

    private int modPow(int a, int b) {
        int res = 1;
        while(b > 0) {
            if((b & 1) == 1) {
                res = mult(res, a);
            }
            a = mult(a, a);
            b /= 2;
        }
        return res;
    }

    public int mult(int a, int b) {
        return (int) (((long) a * b) % MOD);
    }

    public int add(int a, int b) {
        return (int) (((long) a + b) % MOD);
    }
}