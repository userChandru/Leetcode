class Solution {
    public boolean isPowerOfFour(int n) {
        long k=1;
        while(k<n && k<2147483647)
            k<<=2;
        return k==n;
   }
}