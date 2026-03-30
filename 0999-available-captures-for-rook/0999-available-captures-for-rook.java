class Solution {

    int dirs[][] = { {0,1}, {0,-1}, {1,0}, {-1,0} };

    public int helper(char[][] board, int m, int n) {
        if (m >= 0 && m < 8 && n >= 0 && n < 8) {
            if (board[m][n] == '.') 
                return 1;
            else if (board[m][n] == 'B') 
                return 2;
            else if (board[m][n] == 'p') 
                return 3;
        }
        return 0;
    }

    public int numRookCaptures(char[][] board) {
        int i = 0, j = 0, ans = 0;

        outer:
        for (int m = 0; m < 8; m++)
            for (int n = 0; n < 8; n++)
                if (board[m][n] == 'R') {
                    i = m;
                    j = n;
                    break outer;
                }

        for (int dir[] : dirs) {
            int x = i;
            int y = j;
            int temp;
            do {
                x += dir[0];
                y += dir[1];
                temp = helper(board, x, y);
                if (temp == 3) {
                    ans++;
                    break;
                }
            } while (temp == 1);
        }

        return ans;
    }
}