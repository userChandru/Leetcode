int sumBase(int n, int k) {
    int sum=0, i=0;
    while(n){
        sum += n % k;
        n/=k;
    }
    return sum;
}