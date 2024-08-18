/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getRow(int rowIndex, int* returnSize) {
    *returnSize=(rowIndex+1);   
    int* ans = (int*)malloc(sizeof(int)*(rowIndex+1));
    long long temp = 1;
    for(int i = 1; i < rowIndex; i++) {
        temp*=(rowIndex+1-i);
        temp/=i;
        ans[i] = temp;
    }
    ans[0]=1;
    ans[rowIndex]=1;
    return ans;
}