int divide(int dividend, int divisor) {
    if(dividend==INT_MIN && divisor==-1) 
        return INT_MAX;
    int res= dividend/divisor;
    return res; 
}