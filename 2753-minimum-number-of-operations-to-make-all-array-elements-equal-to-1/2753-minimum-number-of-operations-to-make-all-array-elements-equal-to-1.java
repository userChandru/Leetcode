class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        int ones = 0;
        for (int num : nums)
            ones += num == 1 ? 1 : 0;
        if (ones != 0)
            return n - ones;

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < n; j++) {
                temp = gcd(temp, nums[j]);
                if (temp == 1) {
                    ans = Math.min(ans, j - i);
                    break;
                }
            }
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans + n - 1;
    }
}