class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = 0, mid, sum;
        for (int num : nums)
            r = Math.max(r, num);

        while (l < r) {
            mid = (l + r) / 2;
            sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
                if (sum > threshold)
                    break;
            }

            if (sum <= threshold)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
