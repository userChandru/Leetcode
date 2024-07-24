int findGCD(int* nums, int numsSize) {
    int min=1001,max=0;
    for(int i=0; i<numsSize; i++){
        min = (min>nums[i])?nums[i]:min;
        max = (max<nums[i])?nums[i]:max;
    }
    int temp=min;
    while(temp){
        if(min%temp==0 && max%temp==0)
            return temp;
        temp--;
    }
    return 1;
}