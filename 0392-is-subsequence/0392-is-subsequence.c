bool isSubsequence(char* s, char* t) {
    int n1=strlen(s),n2=strlen(t);
    if(n1==0 && n2==0) return true;
    if(n1>n2)   return false;
    for(int i=0,j=0; i<n2; i++){
        if(t[i]==s[j])
            j++;
        if(j==n1)
            return true;
    }
    return false;
}