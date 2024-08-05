int maximumCount(int* nums, int numsSize) {
    if(nums[0]==0 && nums[numsSize-1]==0)
        return 0;
    if(nums[0]>0 || nums[numsSize-1]<0) 
        return numsSize;
    
    int start = 0, end = numsSize-1, pos = 0, neg = 0, mid;

    while(start <= end){
        mid = start + (end-start)/2;
        if(nums[mid]<0 && nums[mid+1]>=0){
            neg=mid+1;
            break;
        }
        else if(nums[mid]>=0)
            end = mid - 1;
        else 
            start = mid + 1;
    }
    pos = numsSize - neg;
    mid=neg;
    while(nums[mid++]==0 && pos-- && mid<numsSize);
    return (pos>neg)?pos:neg;
}