class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int even=0, odd=n-1;
        int[] ans = new int[n];
        for(int num: nums)
            if(num%2==0)
                ans[even++] = 0;
            else 
                ans[odd--] = 1;
        return ans; 
    }
}