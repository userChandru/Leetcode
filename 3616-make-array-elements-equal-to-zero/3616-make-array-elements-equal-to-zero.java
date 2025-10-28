class Solution {
    public int countValidSelections(int[] nums) {
        int ans = 0;
        int leftSum = 0, rightSum = 0;
        int n = nums.length;
        for (int num : nums)
            leftSum += num;

        for (int i = n - 1; i >= 0; i--) {
            rightSum += nums[i];
            leftSum -= nums[i];
            if (nums[i] == 0 && leftSum == rightSum)
                ans += 2;
            if (nums[i] == 0 && leftSum-1 == rightSum)
                ans += 1;
            if (nums[i] == 0 && leftSum == rightSum-1)
                ans += 1;

        }
        return ans;
    }
}