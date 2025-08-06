class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for (int num : nums)
            max |= num;

        return help(0, nums, 0, max);
    }

    private int help(int i, int[] nums, int currOr, int max) {
        if (i == nums.length)
            return currOr == max ? 1 : 0;

        int a = help(i + 1, nums, currOr | nums[i], max);
        int b = help(i + 1, nums, currOr, max);

        return a + b;
    }
}
