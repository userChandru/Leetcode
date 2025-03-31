class Solution {
    public int countBattleships(char[][] board) {
        int dirs[][] = { { 0, 1 }, { 1, 0 } };
        int count = 0;
        int Row = board.length;
        int Col = board[0].length;
        for (int i = 0; i < Row; i++)
            for (int j = 0; j < Col; j++)
                if (board[i][j] == 'X') {
                    count++;
                    if (isValid(Row, Col, i + 1, j) && board[i + 1][j] == 'X')
                        tracer(board, i, j, 1);
                    else if (isValid(Row, Col, i, j + 1) && board[i][j + 1] == 'X')
                        tracer(board, i, j, 0);
                }
        return count;
    }

    private static void tracer(char[][] board, int x, int y, int dir){
        int Row = board.length;
        int Col = board[0].length;
        if(dir == 1)
            for(int i = x; isValid(Row, Col, i , y) && board[i][y]=='X'; i++)
                board[i][y] = '.';
        else    
            for(int j = y; isValid(Row, Col, x , j) && board[x][j]=='X'; j++)
                board[x][j] = '.';
    }

    private static boolean isValid(int Row, int Col, int row, int col){
        return (0 <= row && row < Row && 0 <= col && col < Col);
    }
}