/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findErrorNums(int* nums, int numsSize, int* returnSize) {
    *returnSize=2;
    int* ans = (int*)malloc(sizeof(int)*2);
    int* temp = (int*)malloc(sizeof(int)*numsSize);
    int sum=0;
    for(int i=0; i<numsSize;i++)
        sum+=nums[i];
    for(int i=0; i<numsSize;i++){
        if(temp[nums[i]-1]!=1)
            temp[nums[i]-1]=1;
        else{
            ans[0] = nums[i];
            ans[1] =  (numsSize*(numsSize+1))/2 -sum + nums[i];
            free(temp); 
            return ans;
        }
    }
    return ans;
}