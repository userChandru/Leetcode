int countNegatives(int** grid, int gridSize, int* gridColSize) {        
        int row = gridSize-1;
        int col = 0;
        int count = 0;
        
        while(row>=0 && col< gridColSize[0]){
            if(grid[row][col] < 0){
                row--;
                count += gridColSize[0] - col;
            }
            else{
                col++;
            }
        }
        return count;
}