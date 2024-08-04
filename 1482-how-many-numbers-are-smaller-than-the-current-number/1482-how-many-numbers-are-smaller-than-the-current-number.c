/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* smallerNumbersThanCurrent(int* nums, int numsSize, int* returnSize) {
    
int* ans = malloc(numsSize * sizeof(int));
    *returnSize = numsSize;
    int sum=0;
    int seen[101]={0};
    for(int i=0; i<numsSize; i++)
        seen[nums[i]]++;

    for(int i=0; i<101; i++){
        sum+=seen[i];
        seen[i]=sum;
    }

    for(int i=0; i<numsSize; i++){
        if(nums[i]==0){
            ans[i]=0;
            continue;
        }
        ans[i]=seen[nums[i]-1];
    }
    return ans;
}