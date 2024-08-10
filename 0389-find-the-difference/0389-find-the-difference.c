char findTheDifference(char* s, char* t) {
    int temp=0, n=0;
    while(n < strlen(s)){
        temp-=(int)(s[n]);
        temp+=(int)(t[n]);
        n++;
    }
    temp+=(int)(t[n]);
    return (char)temp;
}