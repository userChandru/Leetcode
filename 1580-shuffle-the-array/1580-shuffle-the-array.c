

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int *ans=(int*)malloc(sizeof(int)*numsSize);
    *returnSize=numsSize;
    for(int i=0,j=i+n,k=0; i<n;i++,j++,k+=2){
        ans[k]=nums[i];
        ans[k+1]=nums[j];
    }
    return ans;
}