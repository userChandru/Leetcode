int alternateDigitSum(int n) {
    int sum=0,d=log10(n),flag=1;
    while(n){
        int t=n/pow(10,d);
        if(flag--)
            sum+=t;
        else if(flag+=2)
            sum-=t;
        n%=(int)pow(10,d--);
    }
    return sum;
}