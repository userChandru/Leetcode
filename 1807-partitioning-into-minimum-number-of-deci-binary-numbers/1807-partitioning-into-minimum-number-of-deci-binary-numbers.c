int minPartitions(char* n) {
    int count=0;
    for(int i=0; i<strlen(n); i++){
        if((int)(n[i]-'0')>count)count=n[i]-'0';
    }
    return count;
}