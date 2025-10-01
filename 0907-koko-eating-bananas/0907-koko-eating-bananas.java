class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0, mid, sum;
        for (int i : piles)
            right = Math.max(i, right);
            
        while (left < right) {
            mid = (left + right) / 2;
            sum = 0;
            for (int i : piles) {
                sum += (i + mid - 1) / mid;
                if (sum > h)
                    break;
            }
            if (sum <= h)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}