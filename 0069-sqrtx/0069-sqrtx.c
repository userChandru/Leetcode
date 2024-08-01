int mySqrt(int x) {
    if(x<2) 
        return x;
    int low = 1, high = x-1;
    while(low <= high){
        long mid = low + (high-low)/2;
        if(mid*mid==x) 
            return mid;
        else if(mid*mid < x)
        {
            if((mid+1)*(mid+1)>x)
                return mid;
            low = mid+1;
        }
        else 
            high = mid-1; 
    }
    return 0;
}