class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean num[] = new boolean[10];
        char ch;
        Arrays.fill(num, true);
        for(int i=0; i<3; i++){
            for(int j=0 ;j<3; j++){
                for(int k=0; k<3; k++){        
                    for(int l=0; l<3; l++){
                        ch = board[i*3 + k][j*3 + l];
                        if(ch=='.')
                            continue;
                        if(num[ch-'0'])
                            num[ch-'0']=false;
                        else
                            return false;
                    }
                }
                Arrays.fill(num, true);
            }
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                ch = board[i][j];
                if(ch=='.')
                    continue;
                if(num[ch-'0'])
                    num[ch-'0']=false;
                else
                    return false;
            }
            Arrays.fill(num, true);
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                ch = board[j][i];
                if(ch=='.')
                    continue;
                if(num[ch-'0'])
                    num[ch-'0']=false;
                else
                    return false;
            }
            Arrays.fill(num, true);
        }
        return true;
    }
}