

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int *ans=(int*)malloc(sizeof(int)*numsSize);
    *returnSize=numsSize;
    for(int i=0,j=0; i<n; i++,j+=2){
        ans[j]=nums[i];
        ans[j+1]=nums[i+n];
    }
    return ans;
}