bool strongPasswordCheckerII(char* password) {
    int a=strlen(password);
    if(a < 8) return false;
    bool u=false,l=false,d=false,s=false;
    for(int i=0; i<a;i++){
        if(i>0 && password[i]==password[i-1])return false;
        if(isupper(password[i])) u=true;
        else if(islower(password[i])) l=true;
        else if(isdigit(password[i])) d=true;
        else s=true;        
    }printf("%d %d %d %d", u,l,d,s);
    return u && l && d && s;
}