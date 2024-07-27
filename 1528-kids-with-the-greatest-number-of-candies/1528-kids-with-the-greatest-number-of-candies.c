/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    *returnSize=candiesSize;
    int max=0;
    bool* ans=(bool*)malloc(sizeof(bool)*candiesSize);
    for(int i=0; i<candiesSize; i++)
        if(max<candies[i])max=candies[i];
    for(int i=0; i<candiesSize; i++)
        ans[i]=(max <= (candies[i]+extraCandies))?true:false;
    return ans;
}