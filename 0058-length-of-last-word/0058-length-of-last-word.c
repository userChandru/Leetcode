int lengthOfLastWord(char* s) {
    int n=strlen(s), c=0;
    while(s[--n]==' ');
    while(n!=-1 && s[n--]!=' ')
        c++;
    return c;
}