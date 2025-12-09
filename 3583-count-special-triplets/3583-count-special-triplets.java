class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        long ans = 0;
        long MOD = 1000_000_007L;

        HashMap<Integer, Integer> right = new HashMap<>();
        HashMap<Integer, Integer> left = new HashMap<>();

        for (int num : nums)
            right.put(num, right.getOrDefault(num, 0) + 1);

        for (int j = 0; j < n; j++) {
            int mid = nums[j];

            right.put(mid, right.get(mid) - 1);

            int l = left.getOrDefault(2 * mid, 0);
            int r = right.getOrDefault(2 * mid, 0);

            ans = (ans + (long) l * r) % MOD;

            left.put(mid, left.getOrDefault(mid, 0) + 1);
        }

        return (int)ans;

    }
}