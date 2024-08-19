int minSteps(int n) {
    if(n==1) return 0;
    int sum = 0;
 
    for (int i=2; i*i <= n; i++) {
        while (n % i == 0) {
            sum += i;
            n /= i;
        }
    }
    if(n>1)
        sum += n;
    return sum;
}