int findClosestNumber(int* nums, int numsSize) {
    int num=nums[0];
    for(int i=1; i<numsSize; i++){
        if(abs(nums[i])<abs(num))
            num = nums[i];
        else if(abs(nums[i])==abs(num))
            num=(nums[i]>num)?nums[i]:num;
    }
    return num;
}