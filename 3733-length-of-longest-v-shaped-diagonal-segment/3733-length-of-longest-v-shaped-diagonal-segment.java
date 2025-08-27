// class Solution {
//     int dp[][][][];
//     int dirs[][] = { { -1, -1 }, { -1, 1 }, { 1, 1 }, { 1, -1 } };
//     int r, c;
//     int searcher = 2;

//     public int helper(int grid[][], int x, int y, int dir, int flip, int check) {
//         int nx = x + dirs[dir][0];
//         int ny = y + dirs[dir][1];
//         if (nx < 0 || r <= nx || ny < 0 || c <= ny || grid[nx][ny] != check)
//             return 1;
//         if (dp[nx][ny][flip][dir] != -1)
//             return dp[nx][ny][flip][dir];
//         int t = helper(grid, nx, ny, dir, flip, 2 - check);
//         if (flip == 0)
//             t = Math.max(t, helper(grid, nx, ny, (dir + 1) % 4, 1, 2 - check));
//         dp[x][y][flip][dir] = t + 1;
//         return t + 1;
//     }

//     public int lenOfVDiagonal(int[][] grid) {
//         r = grid.length;
//         c = grid[0].length;
//         int ans = 0;

//         dp = new int[r][c][2][4];
//         for (int i = 0; i < r; i++)
//             for (int j = 0; j < c; j++)
//                 for (int k = 0; k < 2; k++)
//                     Arrays.fill(dp[i][j][k], -1);

//         for (int i = 0; i < r; i++)
//             for (int j = 0; j < c; j++)
//                 if (grid[i][j] == 1)
//                     for (int dir = 0; dir < 4; dir++)
//                         ans = Math.max(ans, this.helper(grid, i, j, dir, 0, 2));
//         return ans;
//     }
// }

class Solution {
    int[][][][] dp;
    int[][] dirs = { { -1, -1 }, { -1, 1 }, { 1, 1 }, { 1, -1 } };
    int r, c;

    public int helper(int[][] grid, int x, int y, int dir, int flip, int check) {
        int nx = x + dirs[dir][0];
        int ny = y + dirs[dir][1];
        if (nx < 0 || r <= nx || ny < 0 || c <= ny || grid[nx][ny] != check)
            return 0;

        if (dp[nx][ny][flip][dir] != -1)
            return dp[nx][ny][flip][dir];

        int t = helper(grid, nx, ny, dir, flip, 2-check);

        if (flip == 0)
            t = Math.max(t, helper(grid, nx, ny, (dir + 1) % 4, 1, 2-check));

        return dp[nx][ny][flip][dir] = t + 1;
    }

    public int lenOfVDiagonal(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        dp = new int[r][c][2][4];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int f = 0; f < 2; f++)
                    Arrays.fill(dp[i][j][f], -1);

        int ans = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) 
                if (grid[i][j] == 1) 
                    for (int dir = 0; dir < 4; dir++) 
                        ans = Math.max(ans, 1 + helper(grid, i, j, dir, 0, 2));

        return ans;
    }
}

