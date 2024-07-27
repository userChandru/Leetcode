char* tictactoe(int** moves, int movesSize, int* movesColSize) {
    int arr[3][3]={0};
    
    for(int i=0; i<movesSize; i++){
        if(i%2==0)
            arr[moves[i][0]][moves[i][1]]=1;
        else
            arr[moves[i][0]][moves[i][1]]=2;
    }

    for(int i=0; i<3; i++){
        if(arr[i][0]==arr[i][1] && arr[i][1]==arr[i][2]){
            if(arr[i][0]==1) return"A";
            if(arr[i][0]==2) return"B";
        }
        else if(arr[0][i]==arr[1][i] && arr[1][i]==arr[2][i]){
            if(arr[0][i]==1) return "A";
            if(arr[0][i]==2) return "B";
        }
    }
    if((arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2])
    || (arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0]))
    {
        if(arr[1][1]==1) return "A";
        if(arr[1][1]==2) return "B";
    }
    if(movesSize==9) return "Draw";
    return "Pending";
}