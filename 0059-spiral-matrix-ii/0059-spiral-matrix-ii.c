/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** generateMatrix(int n, int* returnSize, int** returnColumnSizes) {
    
    int** ans=(int**)malloc(sizeof(int*) * n);
    
    *returnSize=n;
    *returnColumnSizes = (int*)malloc(sizeof(int) * n);

    for(int i=0; i<n; i++){
        ans[i]=(int*)malloc(sizeof(int)*n);
        (*returnColumnSizes)[i] = n;
    }

    int l=0, r=n, t=0, b=n, val=1;
    while(l<r && t<b){
        for(int i=l; i<r; i++)
            ans[t][i]=val++;
        t++;

        for(int i=t; i<b; i++)
            ans[i][r-1]=val++;
        r--;
        
        if(l>=r || t>=b)
            break;
        
        for(int i=r-1; i>=l; i--)
            ans[b-1][i]= val++;
        b--;

        for(int i=b-1; i>=t; i--)
            ans[i][l]= val++;
        l++;
    } 
    return ans;
}