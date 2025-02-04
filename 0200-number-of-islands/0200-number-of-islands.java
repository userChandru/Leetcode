class Solution {
        int dir[][]= {{0,-1}, {0,1}, {1,0}, {-1,0}};
    public int numIslands(char[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int count=0;

        boolean visited[][]= new boolean[R][C];
        for(int i=0; i<R; i++){            
            for(int j=0; j<C; j++){
                if(grid[i][j] =='0' || visited[i][j])
                    continue;
                count++;
                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{i, j});
                visited[i][j] = true;
                
                while(!q.isEmpty()){
                    int[] curr = q.poll();
                    int r = curr[0], c= curr[1];
                    for(int[] d: dir){
                        int nR = r + d[0];
                        int nC = c + d[1];
                        
                        if(0 > nR || nR >= R ||  0 > nC || nC >= C)
                            continue;
                        if(visited[nR][nC])
                            continue;
                        if(grid[nR][nC]=='0')
                            continue;

                        q.add(new int[]{nR, nC});
                        visited[nR][nC]=true;
                    }
                }
            }
        }
    return count;
    } 
}