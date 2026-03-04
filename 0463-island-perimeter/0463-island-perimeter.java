class Solution {
    int dirs[][] = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    int island[][];
    int m;
    int n;

    public boolean helper(int i, int j){
        return (i>=m || i<0 || j>=n || j<0 || island[i][j]==0);
    }
    public int islandPerimeter(int[][] grid) {
        this.island=grid;
        this.m = grid.length;
        this.n = grid[0].length;
        int ans=0;
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                if(grid[i][j]==1)
                    for(int[] dir : dirs)
                        if(helper(i+dir[0], j+dir[1]))
                            ans++;
        return ans;
    }
}