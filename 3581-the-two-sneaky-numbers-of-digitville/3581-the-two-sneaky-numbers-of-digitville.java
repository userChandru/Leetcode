class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2];
        int n= nums.length;
        int idx=0;
        for(int i=0; i<n; i++){
            int num=Math.abs(nums[i]);
            if(num==10000)
                num=0;
            if(nums[num]<0)
                ans[idx++]=num;
            if(idx==2)
                return ans;
            int t = nums[num] *= -1;
            if(t==0)
                nums[num]=-10000;
        }
        return ans;
    }
}