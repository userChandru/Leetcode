int squaredSum(int t){
    int sum=0;
    while(t){
        sum += (t%10) * (t%10);
        t/=10;
    }
    return sum;
}
    bool isHappy(int n) {
    int temp=n, seen[731]={0};
    while(temp){
        if(temp==1) return true;
        temp = squaredSum(temp);
        if(temp==61 || temp==16 || temp==29 || temp==92)
            return false;   
    }
    return true;
}