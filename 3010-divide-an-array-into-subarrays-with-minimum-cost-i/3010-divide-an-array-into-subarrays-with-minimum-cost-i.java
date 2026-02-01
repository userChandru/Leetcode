class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int min1 = nums[1], min2 = 100;
        for (int i = 2; i < n; i++) {
            if (min1 > nums[i]) {
                min2 = min1;
                min1 = nums[i];
            } 
            else if (min2 > nums[i])
                min2 = nums[i];
        }
        return nums[0] + min1 + min2;
    }
}