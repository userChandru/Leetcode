class Solution {
    int[][][] dp;
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n][k];
        for (int[][] row : dp)
            for (int[] col : row)
                Arrays.fill(col, -1);

        return helper(grid, 0, 0, 0, k);
    }

    int helper(int[][] grid, int r, int c, int sum, int k) {
        if (r < 0 || r == grid.length || c < 0 || c == grid[0].length)
            return 0;

        sum += grid[r][c];
        int rem = sum % k;

        if (r == grid.length - 1 && c == grid[0].length - 1)
            return rem == 0 ? 1 : 0;

        if (dp[r][c][rem] != -1)
            return dp[r][c][rem];

        dp[r][c][rem] = (helper(grid, r + 1, c, sum, k) + helper(grid, r, c + 1, sum, k)) % 1000000007;
        return dp[r][c][rem];
    }
}