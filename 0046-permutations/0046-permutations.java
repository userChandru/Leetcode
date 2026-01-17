class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public void helper(int[] nums, int i) {
        if (i == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums)
                list.add(num);
            ans.add(list);
            return;
        }
        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            helper(nums, i + 1);
            swap(nums, i, j);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        helper(nums, 0);
        return ans;
    }
}