class Solution {
    int grid[][];
    int row;
    int col;
    int dirs[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public void helper(int i, int j, int[] dir) {
    if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == 10 || grid[i][j] == 100)
        return;
    if (grid[i][j] == 0) 
        grid[i][j] = 1;
    helper(i + dir[0], j + dir[1], dir);
}


    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        grid = new int[m][n];
        row = m;
        col = n;
        int ans = 0;

        for (int guard[] : guards)
            grid[guard[0]][guard[1]] = 10;

        for (int wall[] : walls)
            grid[wall[0]][wall[1]] = 100;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 10)
                    for (int[] dir : dirs)
                        helper(i + dir[0], j + dir[1], dir);

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 0)
                    ans++;
        return ans;
    }
}