class Solution {
    public boolean isPowerOfFour(int n) {
        // long k=1;
        // while(k<n && k<2147483647)
        //     k<<=2;
        // return k==n;
        return n>0 && ((n & (n-1)) == 0) && ((n & 0x55555555) != 0);
   }
}