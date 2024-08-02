void moveZeroes(int* nums, int numsSize) {
    for(int i=0, j=0; i<numsSize; i++){
        if(nums[i] != 0){
            int t=nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            j++;
        }
    }
}