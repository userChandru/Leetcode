class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int num : nums) 
            sum += num - (num / 1000 + num / 100 % 10 + num % 100 / 10 + num % 10);
        return Math.abs(sum);  
    }
}