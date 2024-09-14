int longestSubarray(int* nums, int numsSize) {
    int max=nums[0], count=0;
    for(int i=1; i<numsSize; i++)
        if(max<nums[i])
            max=nums[i];
    for(int i=0; i<numsSize; i++){
        int Bcount=0;
        if(nums[i]!=max)
            continue;
        while(i<numsSize && nums[i++]==max)
            Bcount++;
        if (count<Bcount) 
            count=Bcount;
    }
    return count;
}