class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        int k = 1;
        while (k <= 60) {  
            long x = (long) num1 - (long) k * num2;
            if (x < k) return -1;
            if (Long.bitCount(x) <= k) return k;
            k++;
        }
        return -1;
    }
}
