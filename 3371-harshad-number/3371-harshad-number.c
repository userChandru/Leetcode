int sumOfTheDigitsOfHarshadNumber(int x) {
    int ans, sum=0, temp=x;
    while(temp){
        sum+=temp%10;
        temp/=10;
    }
    if(x%sum==0)
        return sum;
    else
        return -1;
}