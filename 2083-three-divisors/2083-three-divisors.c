bool isThree(int n) {
    int count=1,i=2;
    while(count<=3 && i<=n){
        if(n % i++ == 0)
            count++;
    }
    return count==3;
}