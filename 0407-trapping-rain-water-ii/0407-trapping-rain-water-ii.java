class Solution {
    public int trapRainWater(int[][] map) {
        int m = map.length, n = map[0].length;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] seen = new boolean[m][n];
        int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        for (int i = 0; i < m; i++) {
            pq.offer(new int[] { map[i][0], i, 0 });
            pq.offer(new int[] { map[i][n - 1], i, n - 1 });
            seen[i][0] = true;
            seen[i][n - 1] = true;
        }
        for (int j = 0; j < n; j++) {
            pq.offer(new int[] { map[0][j], 0, j });
            pq.offer(new int[] { map[m - 1][j], m - 1, j });
            seen[0][j] = true;
            seen[m - 1][j] = true;
        }

        int result = 0;

        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int h = cell[0];
            int x = cell[1];
            int y = cell[2];

            for (int[] dir : dirs) {
                int nx = x + dir[0], ny = y + dir[1];

                if (nx >= 0 && ny >= 0 && nx < m && ny < n && !seen[nx][ny]) {

                    result += Math.max(0, h - map[nx][ny]);                    
                    pq.offer(new int[] { Math.max(h, map[nx][ny]), nx, ny });
                    seen[nx][ny] = true;
                }
            }
        }

        return result;
    }
}