class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = 0;
        for (int num : nums)
            right = Math.max(right, num);

        while (left < right) {
            int mid = (left + right) / 2;
            int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
                if (sum > threshold)
                    break;
            }

            if (sum <= threshold)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}
