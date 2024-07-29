int differenceOfSums(int n, int m) {
    int num1=0;
    for(int i=0; i<=n; i++)
        if(i%m==0) num1+=i;
    return ((n*(n+1))/2)-(2*num1);
}