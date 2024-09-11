bool isMonotonic(int* nums, int numsSize) {
    int inc=0, dec=0;
    for(int i=1; i<numsSize; i++){
        if(nums[i-1] < nums[i])
            inc=1;
        else if(nums[i-1] > nums[i])
            dec=1;
    }
    if(inc==0 && dec == 0) return 1;
    return inc!=dec;
}