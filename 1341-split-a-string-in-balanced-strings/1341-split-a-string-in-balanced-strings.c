int balancedStringSplit(char* s) {
    int count=0,l=0,i=0;
    do{
        if(s[i]=='R')l--;
        else l++;
        if(l==0)count++;
    }while(s[++i]!='\0');
    return count;

}