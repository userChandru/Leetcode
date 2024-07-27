int sumFourDivisors(int* nums, int numsSize) {
    int sum=0,count=2,temp=0;
    for(int i=0; i<numsSize; i++){
        for(int j=2; j<=sqrt(nums[i]); j++){
            if(nums[i]%j==0){
                temp+=j;
                count++;
                if(j!=nums[i]/j){
                    temp+=nums[i]/j;
                    count++;
                }
                if(count>5) break;
            }
        }
        if(count==4)
            sum+=temp+nums[i]+1;
        temp=0;
        count=2;
    }
    return sum;
}