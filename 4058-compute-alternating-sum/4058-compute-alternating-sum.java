class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0, flag=1;
        for(int num: nums){
            sum += num*flag;
            flag*=-1;
        }
        return sum;
    }
}