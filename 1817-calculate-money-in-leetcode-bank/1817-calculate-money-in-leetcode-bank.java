class Solution {
    public int totalMoney(int n) {
        int weeks = n/7, days= n%7;
        return 28 * weeks + 7 * weeks * (weeks-1)/2 + (2 * weeks + days + 1) * days/2;
    }
}