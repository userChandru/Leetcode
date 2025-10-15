class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size(), i = 0, ans = 0;
        int max = 0;

        while (i < n) {
            int temp = i;
            while (i + 1 < n && nums.get(i) < nums.get(i + 1))
                i++;

            int curr = i - temp + 1;
            ans = Math.max(ans, Math.max(curr >> 1, Math.min(curr, max)));

            max = curr;
            i++;
        }

        return ans;
    }
}