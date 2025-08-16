class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<1)
        //     return false;
        return n > 0 && (1162261467 % n) == 0;
    }
}