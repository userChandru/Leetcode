int maximumLengthSubstring(char* s) {
    int seen[26]={0},res=0;
    for(int i=0, j=0; i<strlen(s); i++){
        if(++seen[s[i]-'a']>2)
            while(seen[s[i]-'a']>2)
                seen[s[j++]-'a']--;
        res = ( res > (i-j+1)) ? res : (i-j+1);
    }
    return res;
}
