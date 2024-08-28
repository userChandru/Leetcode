int* sortedSquares(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize;
    int* ans = malloc(sizeof(int) * numsSize);
    
    int start = 0;
    int end = numsSize - 1;
    int idx = numsSize - 1;
    
    while(start <= end) {
        int startSqr = nums[start] * nums[start];
        int endSqr = nums[end] * nums[end];
        
        if(startSqr > endSqr) {
            ans[idx--] = startSqr;
            start++;
        } else {
            ans[idx--] = endSqr;
            end--;
        }
    }
    
    return ans;
}