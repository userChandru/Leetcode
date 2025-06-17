class Solution {
    private int max(int arr[], int start, int capacity){
        int maxInd=start;
        int i=start, returnee=0;
        for( ; i<arr.length && i<start+capacity; i++){
            if(maxInd + arr[maxInd] <= i+arr[i])
                maxInd=i;
            if(i+arr[i] >= arr.length-1)
                returnee = i;
        }
        if(i==arr.length)
            return i;
        if(returnee!=0)
            return returnee;
        return maxInd;
    }
    public int jump(int[] nums) {
        if(nums.length==1)
            return 0;
            
        int index=0, count=0;
        while(index!=nums.length){
            count++;
            index=this.max(nums, index+1, nums[index]);
            System.out.println(index);
        }
        return count;
    }
}