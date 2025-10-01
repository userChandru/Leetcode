class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for (int i : piles)
            right = Math.max(i, right);

        while (left < right) {
            int mid = (left + right) / 2;
            int sum = 0;
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