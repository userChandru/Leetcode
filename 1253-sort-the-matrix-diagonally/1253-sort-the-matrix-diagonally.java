class Solution {
    public int[][] diagonalSort(int[][] grid) {
        if (grid.length == 1 || grid[0].length == 1)
            return grid;
        int r = grid.length, c = grid[0].length;
        int i = r, j = 0;
        int m, n, t;
        while (i != 0 || j != c - 1) {
            if (i > 0) {
                i--;
                m = 0;
                while (m + i < r) {
                    n = m + 1;
                    while (n + i < r && n + j < c) {
                        if (grid[i + m][j + m] > grid[i + n][j + n]) {
                            t = grid[i + m][j + m];
                            grid[i + m][j + m] = grid[i + n][j + n];
                            grid[i + n][j + n] = t;
                        }
                        n++;
                    }
                    m++;
                }
                continue;
            } else if (j < c - 1) {
                j++;
                m = 0;
                while (m + j < c) {
                    n = m + 1;
                    while (n + j < c && n + i < r) {
                        if (grid[i + m][j + m] > grid[i + n][j + n]) {
                            t = grid[i + m][j + m];
                            grid[i + m][j + m] = grid[i + n][j + n];
                            grid[i + n][j + n] = t;
                        }
                        n++;
                    }
                    m++;
                }
            }
        }
        return grid;
    }
}