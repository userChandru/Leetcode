bool isPerfectSquare(int num) {
    if(num==1) return 1;
    long start = 1, end = num/2; 
    while(start<=end){
        long mid = start + (end-start)/2;
        if(mid*mid == num)
            return true;
        else if(mid*mid<num)
            start = mid+1;
        else 
            end = mid-1;
    }
    return false;
}