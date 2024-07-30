double myPow(double x, int n) {
        double ans=1;
        long temp = n;
        if(temp<0)
            temp *= -1;
        
        while(temp>0)
            if(temp%2==0){
                x = x*x;
                temp = temp/2;
            }
            else{
                ans = ans * x;
                temp--;
            }
        if(n<0){
            return (double) 1/ans;
        }
        return ans;
}