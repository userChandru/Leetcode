class Solution {
    int m, n;
    int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    int[][] grid;
    
    private void dfs(boolean[][] seen, int r, int c, int prev) {
        if (r < 0 || c < 0 || r >= m || c >= n || seen[r][c] || grid[r][c] < prev)
            return;

        seen[r][c] = true;
        
        for (int[] dir : dirs)
            dfs(seen, r + dir[0], c + dir[1], grid[r][c]);
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;
        grid = heights;
        boolean[][] pac = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            dfs(pac, i, 0, heights[i][0]);
            dfs(atl, i, n - 1, heights[i][n-1]);
        }
        for (int j = 0; j < n; j++) {
            dfs(pac, 0, j, heights[0][j]);
            dfs(atl, m - 1, j, heights[m-1][j]);
        }

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (pac[i][j] && atl[i][j])
                    ans.add(Arrays.asList(i, j));

        return ans;
    }
}

