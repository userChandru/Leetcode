int searchInsert(int* nums, int numsSize, int target) {
    int start = 0, end = numsSize-1;
    if(nums[0] > target) return 0;
    if(nums[end] < target) return end+1;
    while(start <= end){
        int mid = start + (end-start)/2;
        if((nums[mid] == target) || (nums[mid] > target && nums[mid-1] < target))
            return mid;
        else if(nums[mid]<target)
            start=mid+1;
        else 
            end=mid-1;
    }
    return 0;
}