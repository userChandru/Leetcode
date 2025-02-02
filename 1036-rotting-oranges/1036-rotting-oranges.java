class Solution {
    int direction[][] = {{0,1},{0,-1}, {1,0},{-1,0}};
    public int orangesRotting(int[][] grid) {
        int Row = grid.length;
        int Col = grid[0].length;

        Queue<int[]> rottenQueue = new LinkedList<>();
        boolean[][] isRotten = new boolean[Row][Col];
        boolean willRot = false;
        for(int i=0; i<Row; i++)
            for(int j=0; j<Col; j++)
                if(grid[i][j]==2){
                    isRotten[i][j] = true;
                    rottenQueue.add(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                    willRot=true;

        if(!willRot)
            return 0;
        if(rottenQueue.isEmpty())
            return -1;
        int time = -1;
        while(!rottenQueue.isEmpty()){
            int size=rottenQueue.size();
            for(int i=0; i<size; i++){
                int curr[] = rottenQueue.poll();
                for(int[] d : direction){
                    int nR = d[0] + curr[0];
                    int nC = d[1] + curr[1];
                    
                    if(nR < 0 || Row <= nR || nC < 0 || Col <= nC)
                        continue;
                    if(grid[nR][nC] == 0 || isRotten[nR][nC])
                        continue;

                    isRotten[nR][nC] = true;
                    rottenQueue.add(new int[]{nR, nC});
                }
            }
            time++;
        }
        for(int i = 0; i<Row; i++)
            for(int j=0; j<Col; j++)
                if(grid[i][j]==1 && !isRotten[i][j])
                    return -1;
        return time;
    }
}