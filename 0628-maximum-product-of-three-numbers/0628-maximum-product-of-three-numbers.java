class Solution {
    public int maximumProduct(int[] nums) {
        int max1=nums[0], max2=nums[1], max3=nums[2], min1 = nums[0], min2=nums[1];
        if(max3>max2){
            int t = max3;
            max3=max2;
            max2=t;
        }
        if(max2>max1){
            int t = max1;
            max1=max2;
            max2=t;
            if(max3>max2){
                int te = max3;
                max3=max2;
                max2=te;
            }
        }
        if(min1>min2){
            int t = min1;
            min1=min2;
            min2=t;
        }

        for(int i=3; i<nums.length; i++){
            if(max3<nums[i]){
                max3=nums[i];
            }
            if(max3>max2){
                int t = max3;
                max3=max2;
                max2=t;
            }
            if(max2>max1){
                int t = max1;
                max1=max2;
                max2=t;
            }
        }
        for(int i=2; i<nums.length; i++){
            if(min2>nums[i]){
                min2=nums[i];
            }
            if(min2<min1){
                int t = min1;
                min1=min2;
                min2=t;
            }
        }
        System.out.printf("%d %d %d %d %d", max1,max2,max3,min1,min2);
        int prod1 = max1*max2*max3;
        int prod2 = max1*min1*min2;
        return prod1>prod2?prod1:prod2;
    }
}