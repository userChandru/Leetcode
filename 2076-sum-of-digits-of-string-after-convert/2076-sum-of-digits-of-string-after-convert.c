int getLucky(char* s, int k) {
    int sum=0,add=0;
    for(int i=0; s[i]!='\0'; i++){
        int a=((int)(s[i]-'a')+1);
        sum+=(a%10)+(a/10);
    }
    k--;
    while(sum>=10 && k--){
        while(sum){
            add+=sum%10;
            sum/=10;
        }
        sum=add;
        add=0;
    }
    return sum;
}