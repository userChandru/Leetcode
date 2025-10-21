class Solution {
    public int maxFrequency(int[] nums, int k, int numOps) {
        int max = nums[0];
        for (int num : nums) 
            if (num > max)
                max = num;
        max += k + 2;
        int[] count = new int[max];

        for (int v : nums)
            count[v]++;

        for (int i = 1; i < max; i++)
            count[i] += count[i - 1];

        int res = 0;
        for (int i = 0; i < max; i++) {
            int left = Math.max(0, i - k);
            int right = Math.min(max - 1, i + k);
            int total = count[right] - (left > 0 ? count[left - 1] : 0);
            int freq = count[i] - (i > 0 ? count[i - 1] : 0);
            res = Math.max(res, freq + Math.min(numOps, total - freq));
        }

        return res;
    }
}