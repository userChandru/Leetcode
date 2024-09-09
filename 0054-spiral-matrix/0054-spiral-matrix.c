/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    *returnSize= matrixSize * matrixColSize[0];
    int* ans=(int*)malloc(sizeof(int) * *returnSize);
    int  l=0,r=matrixColSize[0],t=0,b=matrixSize, idx=0;
    
    while(t<b && l<r)  {
        for(int i=l; i<r; i++)
            ans[idx++]=matrix[t][i];
        t++;

        for(int i=t; i<b; i++)
            ans[idx++]=matrix[i][r-1];
        r--;
        if(t<b){
            for(int i=r-1; i>=l; i--)
                ans[idx++]=matrix[b-1][i];
            b--;
        }
        if(l<r){
            for(int i=b-1; i>=t; i--)
                ans[idx++]=matrix[i][l];
            l++;
        }
    }
    return ans;
}