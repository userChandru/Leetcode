int countDigits(int num) {
    int count=0, temp=num, i;
    while((i=temp%10) && i){
        if(num%i==0)
            count++;
        temp/=10;
    }
    return count;
}