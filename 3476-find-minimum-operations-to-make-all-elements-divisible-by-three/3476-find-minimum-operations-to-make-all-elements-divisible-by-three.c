int minimumOperations(int* nums, int numsSize) {
    int count=numsSize;
    for(int i=0; i<numsSize; i++){
        if(nums[i]%3==0)count--;
    }
    return count;
}