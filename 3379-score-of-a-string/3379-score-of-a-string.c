int scoreOfString(char* s) {    
    int sum=0;
    for(int i=0; i<strlen(s)-1; i++){
        sum+=abs((int)s[i]-(int)s[i+1]);
    } 
    return sum;  
}