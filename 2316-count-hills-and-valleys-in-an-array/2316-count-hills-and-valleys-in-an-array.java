class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        int size=nums.length;
        for(int i=1; i<size-1; i++){
            int left= finder(nums, size, i, -1);
            int right= finder(nums, size, i, 1);
            if(left>=0 && right<size && ((nums[i]>nums[right] && nums[i]>nums[left]) || (nums[i]<nums[right] && nums[i]<nums[left]))){
                count++;
                System.out.println(nums[i]+"-"+i +"  ");
            }
            i=right-1;
        }
        return count;
    }
    public int finder(int[] nums, int size, int i, int set){
        int j=i+1*set;
        while(0<=j && j<size && nums[i]==nums[j]){
            j+=set;
        }
        return j;
    }
}