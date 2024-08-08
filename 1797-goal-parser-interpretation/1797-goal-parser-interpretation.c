char * interpret(char * command){
    char* ans = (char*)malloc(100);
    int j=0;
    for(int i=0; i<strlen(command); i++){
        if(command[i]=='G')
            ans[j++]='G';
        else if(command[i]=='(' && command[i+1]==')'){
            ans[j++]='o';
            i+=1;
        }
        else if(command[i]=='(' && command[i+1]=='a'){
            ans[j++]='a';
            ans[j++]='l';
            i+=3;
        }
    }
    ans[j]='\0';
    return ans;
}