class Solution {

    int directions[][] = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 } };

    public int orangesRotting(int[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;
        boolean[][] isRotten = new boolean[ROW][COL];
        boolean willRot = false;
        Queue<int[]> rottenQueue = new LinkedList<>();
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 2) {
                    rottenQueue.add(new int[] { i, j });
                    isRotten[i][j] = true;
                }
                if(grid[i][j]==1)
                    willRot = true;
            }
        }
        if(!willRot) return 0;
        if (rottenQueue.isEmpty())
            return -1;
        int time = -1;
        while (!rottenQueue.isEmpty()) {
            int rottenOrange = rottenQueue.size();
            for (int i = 0; i < rottenOrange; i++) {
                int[] curr = rottenQueue.poll();
                for (int[] d : directions) {
                    int newRow = d[0] + curr[0];
                    int newCol = d[1] + curr[1];
                    if (0 > newRow || newRow >= ROW || 0 > newCol || newCol >= COL)
                        continue;
                    if (isRotten[newRow][newCol])
                        continue;
                    if (grid[newRow][newCol] == 0)
                        continue;

                    isRotten[newRow][newCol] = true;
                    rottenQueue.add(new int[] { newRow, newCol });
                }
            }
            time++;
        }
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (grid[i][j] == 1 && isRotten[i][j] == false) {
                    return -1;
                }
            }
        }
        return time;
    }
}