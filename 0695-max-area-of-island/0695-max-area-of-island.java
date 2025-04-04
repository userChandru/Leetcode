class Solution {
    int dirs[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1){
                    int currArea = this.countArea(i, j, grid);
                    if (maxArea < currArea)
                        maxArea = currArea;
                }
            }
        }
        return maxArea;
    }

    private int countArea(int r, int c, int[][] grid) {
        Queue<Integer[]> q = new LinkedList<>();
        q.add(new Integer[] { r, c });
        int i = 0;
        while (!q.isEmpty()) {
            i++;
            Integer[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            grid[x][y] = -1;
            for (int[] dir : dirs) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (0 <= newX && newX < grid.length && 0 <= newY && newY < grid[0].length) {
                    if (grid[newX][newY] == 1) {
                        grid[newX][newY] = -1;
                        q.add(new Integer[] { newX, newY });
                    }
                }
            }
        }
        return i;
    }
}