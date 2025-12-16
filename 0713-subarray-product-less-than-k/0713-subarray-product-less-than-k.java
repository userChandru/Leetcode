class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) 
            return 0;

        int left = 0;
        int right = 0;
        int prod = 1;
        int count = 0;
        int n = nums.length;

        while (right < n) {
            prod *= nums[right];
            while (prod >= k) 
                prod /= nums[left++];
            count += 1 + (right - left);
            right++;
        }
        return count;
    }
}