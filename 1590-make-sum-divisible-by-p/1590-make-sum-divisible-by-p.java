class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for (int num : nums)
            sum += num;

        int rem = (int) (sum % p);
        if (rem == 0)
            return 0;

        HashMap<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0, -1);
        long prefixSum = 0;
        int min = nums.length;

        for (int i = 0; i < nums.length; ++i) {
            prefixSum += nums[i];
            int curr = (int) (prefixSum % p);
            int target = (curr - rem + p) % p;

            if (prefix.containsKey(target))
                min = Math.min(min, i - prefix.get(target));

            prefix.put(curr, i);
        }

        return min == nums.length ? -1 : min;
    }
}