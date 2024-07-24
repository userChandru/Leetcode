int minPartitions(char* n) {
    int max=0;
    max= n[0]-'0';
    for(int i=1;n[i]!='\0';i++){
        int temp= n[i]-'0';
        if(max<temp)
            max=temp;
    }
    return max;
}