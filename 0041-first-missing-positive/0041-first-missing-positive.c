int firstMissingPositive(int* nums, int numsSize) {
    for(int i = 0; i < numsSize; i++)
        if(nums[i] <= 0)
            nums[i] = numsSize + 1;

    for(int i = 0; i < numsSize; i++)
        if((abs(nums[i]) - 1) < numsSize && nums[abs(nums[i])- 1] > 0)
            nums[abs(nums[i]) - 1] *= -1;

    for(int i = 0; i < numsSize; i++)
        if(nums[i] > 0) 
            return i + 1;
    return numsSize+1;
}