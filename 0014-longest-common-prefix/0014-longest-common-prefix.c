char* longestCommonPrefix(char** strs, int strsSize) {
    
    if(strsSize == 1)
        return strs[0];
    char *ans = (char *)malloc(strlen(strs[0]) + 2);
    ans[0]='\0';
    for(int i = 0; i < strlen(strs[0]); i++){
        int flag = 1;
        for(int j = 1; j < strsSize; j++)
            if(strs[0][i] != strs[j][i])
                flag = 0;
        if(flag){
            ans[i] = strs[0][i];
            ans[i+1] = '\0';
        }
        else { 
            if(ans[0]) 
                return ans;
            return "";
        }
    }
    return ans;
}