class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<1)
        //     return false;
        return n > 0 && ((int)Math.pow(3,19) % n) == 0;
    }
}