bool areNumbersAscending(char* s) {
    int curr=0;
    for(int i=0; i<strlen(s); i++){
        if(isdigit(s[i])){
            if(isdigit(s[i+1])){
                int num= ((int)(s[i]-'0')*10 ) + ((int)(s[i+1]-'0'));
                if(curr>=num)    
                    return false;
                curr=num;
                i++;
            }
            else{
                int num =(int)(s[i]-'0');
                if(curr>=num)    
                    return false;
                curr=num;
              }
        }
    }
    return true;
}