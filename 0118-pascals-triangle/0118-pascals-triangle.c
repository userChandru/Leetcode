/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** generate(int numRows, int* returnSize, int** returnColumnSizes) {
    int** ans = (int**)malloc(sizeof(int*)*numRows);
    *returnColumnSizes = (int*)malloc(sizeof(int) * numRows);
    for(int i=0; i<numRows; i++){
        ans[i]=(int*)malloc(sizeof(int)*(i+1));
        for(int j=0; j<=i; j++)
            if(i==j || j==0)
                ans[i][j]=1;
            else
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];   
        (*returnColumnSizes)[i] = i + 1; 
    }

    *returnSize = numRows;
    return ans;
}