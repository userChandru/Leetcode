class Solution {
    public int countOdds(int low, int high) {
        int ans = high - low + 1;

        if ((low & 1) == 1 && (high & 1) == 1)
            return ans / 2 + 1;

        else
            return ans / 2;
    }
}