int findDuplicate(int* nums, int numsSize) {
    int* ans=(int*)malloc(sizeof(int)*numsSize);
    for(int i=0; i<numsSize;i++){
        if(ans[nums[i]-1]!=1)
            ans[nums[i]-1]=1;
        else{
            free(ans);
            return nums[i];
        }
    }
    return 1;
}