char * defangIPaddr(char * address){
    int j=0;
    char* ans = (char*)malloc(strlen(address)+7);
    for(int i=0; i<strlen(address); i++){
        if(address[i]=='.'){
            ans[j++]='[';
            ans[j++]='.';
            ans[j++]=']';
        }
        else
            ans[j++]=address[i];
    }
    ans[j]='\0';
    return ans;
}