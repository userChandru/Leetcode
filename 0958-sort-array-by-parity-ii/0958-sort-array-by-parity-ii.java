class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length;
        int s = 0, e = 1;

        int[] ans = new int[n];
        
        for (int num : nums)
            if (num % 2 == 0){
                ans[s] = num;
                s+=2;
            }
            else{
                ans[e] = num;
                e+=2;
            }
        return ans;
    }
}