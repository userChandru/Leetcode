int strStr(char* haystack, char* needle) {
    int nlen = strlen(needle);
    int hlen = strlen(haystack);
    if (nlen > hlen) return -1;

    for(int i=0; i<=hlen-nlen; i++){
        if(needle[0]==haystack[i]){
            int j=1;
            while(j<nlen){
                if(needle[j]!=haystack[i+j])
                    break;
                j++;
            }
            if(j==nlen)
                return i;
        }
    }
    return -1;
}