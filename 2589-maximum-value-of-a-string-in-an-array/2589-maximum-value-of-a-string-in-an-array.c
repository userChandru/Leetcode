int maximumValue(char** strs, int strsSize) {
    int max=0;
    for(int i=0; i<strsSize; i++){
        int n=strlen(strs[i]), curr=0, flag=0;
        for(int j=0; j<n; j++){
            if(isalpha(strs[i][j])){
                flag=1;
                break;
            }
        }
        if(flag)
            curr=n;
        else
            curr=atoi(strs[i]);
        if(max<curr)
            max=curr;
    }
    return max;
}