bool isSquare(long num){
    return (int)sqrt(num)*(int)sqrt(num)==num;
}

bool judgeSquareSum(int c) {
    if(c<3)
        return true;
    
    long a=0, b=sqrt(c);
    if(b*b == c)
        return true;
    for(int i=0; i<=b; i++){
        if(isSquare(c-(i*i)))
            return true;
    }
    return false;
}