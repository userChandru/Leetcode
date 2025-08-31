class Solution {
    char grid[][];
    char ans[][];
    int rowMask[];
    int colMask[];
    int boxMask[];
    boolean found = false;

    public boolean checker(int i, int j, int n) {
        return (rowMask[i] & (1 << n)) == 0 && (colMask[j] & (1 << n)) == 0
                && (boxMask[(i / 3) * 3 + (j / 3)] & (1 << n)) == 0;
    }

    public void marker(int i, int j, int k) {
        rowMask[i] |= 1 << k;
        colMask[j] |= 1 << k;
        boxMask[(i / 3) * 3 + (j / 3)] |= 1 << k;
    }

    public void unmarker(int i, int j, int k) {
        rowMask[i] &= ~(1 << k);
        colMask[j] &= ~(1 << k);
        boxMask[(i / 3) * 3 + (j / 3)] &= ~(1 << k);
    }

    public boolean solved() {
        boolean flag = true;
        for (int i = 0; i < 9; i++) {
            if (rowMask[i] != 1022)
                return false;
            if (colMask[i] != 1022)
                return false;
            if (boxMask[i] != 1022)
                return false;
        }
        return found = flag;
    }

    public void helper(int i, int j) {
        if (i == 9) {
            found = true;
            return;
        }

        if (j == 9) {
            helper(i + 1, 0);
            return;
        }
        // System.out.print\n("i:"+i +" j:"+j);
        if (grid[i][j] != '.') {
            helper(i, j + 1);
            return;
        }

        for (int k = 1; k <= 9; k++) {
            if (checker(i, j, k)) {
                ans[i][j] = (char) (k + '0');
                marker(i, j, k);
                helper(i, j + 1);
                if (found)
                    return;
                ans[i][j] = '.';
                unmarker(i, j, k);
            }
        }
        return;
    }

    public void solveSudoku(char[][] board) {
        grid = board;
        ans = new char[9][9];
        rowMask = new int[9];
        colMask = new int[9];
        boxMask = new int[9];

        Arrays.fill(rowMask, 0);
        Arrays.fill(colMask, 0);
        Arrays.fill(boxMask, 0);

        int idx = 0;
        for (char[] t : board)
            ans[idx++] = t.clone();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                int n = board[i][j] - '0';
                rowMask[i] |= 1 << n;
                colMask[j] |= 1 << n;
                boxMask[(i / 3) * 3 + (j / 3)] |= 1 << n;
            }
        }
        helper(0, 0);
        idx = 0;
        for (char[] t : ans)
            board[idx++] = t.clone();
    }
}
