class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int zeroes = 0;
        int i = 0;
        while (i<n && nums[i] != 1)
            i++;
        for (i++; i < n; i++) {
            int num = nums[i];
            if (num == 1 && zeroes >= k)
                zeroes = 0;
            else if (num == 0)
                zeroes++;
            else
                return false;
        }
        return true;
    }
}