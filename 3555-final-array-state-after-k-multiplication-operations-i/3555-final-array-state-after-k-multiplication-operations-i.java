class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minInd = 0;
            int n =nums.length;
            for (int j = 1; j < n; j++)
                if (nums[j] < nums[minInd])
                    minInd = j;
            nums[minInd] *= multiplier;
        }
        return nums;
    }
}