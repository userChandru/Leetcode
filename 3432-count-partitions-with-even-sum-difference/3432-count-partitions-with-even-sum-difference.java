class Solution {
    public int countPartitions(int[] nums) {
        int Rsum = 0;
        int Lsum = 0;
        int ans = 0;
        int n = nums.length;
        for (int num : nums)
            Rsum += num;
        for (int i = 0; i < n - 1; i++) {
            Rsum -= nums[0];
            Lsum += nums[0];
            if ((Rsum - Lsum) % 2 == 0)
                ans++;
        }
        return ans;
    }
}