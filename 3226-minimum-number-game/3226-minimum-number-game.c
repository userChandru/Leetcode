/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* numberGame(int* nums, int numsSize, int* returnSize) {
    for(int i=0; i< numsSize; i++)
        for(int j=i+1; j<numsSize; j++)
            if(nums[i]>nums[j]){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
    *returnSize=numsSize;
    int* ans = (int*)malloc(sizeof(int)*numsSize); 
    for(int i=0; i<numsSize; i=i+2){
        ans[i]=nums[i+1];
        ans[i+1]=nums[i];
    }
    return ans;
}