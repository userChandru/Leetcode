class Solution {
    public int longestSubarray(int[] nums) {
        int c=0, i=0, j=0, n=nums.length, max=0;
        while(j!=n){
            if(nums[j]==0)
                c++;
            while(c>=2){
                if(nums[i]==0)
                    c--;
                i++;
            }
            if(max<j-i)
                max=j-i;
            j++;
        }
        return max;
    }
}