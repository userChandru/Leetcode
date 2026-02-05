class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0, count = 0;
        for (int i = 0; i < nums.length; i++)
            if (i == 0 || nums[i - 1] < nums[i])
                ans = Math.max(ans, ++count);
            else
                count = 1;
        return ans;
    }
}