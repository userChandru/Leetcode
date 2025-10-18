
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        if (nums.length <= k * 2 + 1)
            return nums.length;

        Arrays.sort(nums);

        int min = Integer.MIN_VALUE;
        int ans = 0;

        for (int num : nums)
            if (min < num + k) {
                min = Math.max(num - k, min + 1);
                ans++;
            }

        // int n = nums.length;
        // Set<Integer> set = new HashSet<>();

        // for (int i = 0; i < n; i++) {
        //     int temp = -k;
        //     while (i + 1 < n && nums[i] == nums[i + 1]) {
        //         while (temp < k && set.contains(nums[i] + temp))
        //             temp++;
        //         set.add(nums[i] + temp);
        //         i++;
        //     }
        //     while (temp < k && set.contains(nums[i] + temp))
        //         temp++;
        //     set.add(nums[i] + temp);
        // }
        // return set.size();

        return ans;
    }
}