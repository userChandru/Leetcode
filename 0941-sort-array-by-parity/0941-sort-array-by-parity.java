class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n = nums.length;
        int s = 0, e = n - 1;

        int[] ans = new int[n];
        
        for (int num : nums)
            if (num % 2 == 0)
                ans[s++] = num;
            else
                ans[e--] = num;
        return ans;
    }
}