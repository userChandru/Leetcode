/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
 int maxy(int i,int j, int** arr){
    int maxNum=0;
    for(int a = i; a < i+3; a++)
        for(int b = j; b < j+3; b++)
            if(maxNum<arr[a][b])    maxNum=arr[a][b];
    return maxNum;
 }
int** largestLocal(int** arr, int n, int* col, int* returnSize, int** returnColumnSizes) {
    int m=n-2;
    int** ans=(int**)malloc(sizeof(int*)*m);
    for(int i=0; i<m;i++)
        ans[i]=(int*)malloc(sizeof(int)*m);

    for(int i=0;i<m;i++)
        for(int j=0;j<m;j++)
            ans[i][j]=maxy(i, j, arr);
    *returnSize = m;
    *returnColumnSizes = (int*)malloc(sizeof(int)*m);
    for(int i=0; i<(*returnSize);i++)
        (*returnColumnSizes)[i] = m;
    return ans;
}