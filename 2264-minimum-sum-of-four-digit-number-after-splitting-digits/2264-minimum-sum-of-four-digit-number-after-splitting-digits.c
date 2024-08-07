int minimumSum(int num) {
    int nums[4], i=3, sum=0;
    while(num){
        nums[i--]=num%10;
        num/=10;
    }
    for(int i=0; i<4; i++)
        for(int j=i+1; j<4; j++)
            if(nums[i]>nums[j]){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
    return nums[0]*10 + nums[1]*10 + nums[2] + nums[3];
}