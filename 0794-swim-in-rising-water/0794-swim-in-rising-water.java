class Solution {
    int dirs[][]= {{1,0}, {0,1}, {-1,0}, {0,-1}};
    boolean seen[][];
    int n;
    public boolean helper(int[][] grid, int r, int c, int max){
        if(r<0 || n<=r || c<0 || n<=c || seen[r][c] || grid[r][c]>max)
            return false;
        if(r==n-1 && c==n-1)
            return true;
        seen[r][c]=true;
        for(int[] dir : dirs){
            int nR = r+dir[0];
            int nC = c+dir[1];
            if(helper(grid, nR, nC, max))
                return true;
        }
        return false;
    }
    public int swimInWater(int[][] grid) {
        n = grid.length;
        int l=0, r=n*n -1;
        int min=r;
        while(l<r){
            int mid = (l+r)/2;
            seen = new boolean[n][n];
            if(helper(grid, 0, 0, mid)){
                r=mid;
                min=mid;
            }
            else 
                l=mid+1;
        }
        return min;
    }
}