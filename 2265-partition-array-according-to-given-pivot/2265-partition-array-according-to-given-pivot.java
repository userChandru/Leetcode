class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int s = 0, e = n - 1;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++)
            if (nums[i] < pivot)
                ans[s++] = nums[i];

        for (int i = n-1; i >= 0; i--)
            if (nums[i] > pivot)
                ans[e--] = nums[i];
        while (s <= e)
            ans[s++] = pivot;

        return ans;
    }
}