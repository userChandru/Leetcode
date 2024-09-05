/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* missingRolls(int* rolls, int rollsSize, int mean, int n, int* returnSize) {
    *returnSize=n;
    int msum = 0, nsum=0;
    int *ans = (int*)malloc(sizeof(int)*n);
    
    for(int i=0; i<rollsSize; i++)
        msum+=rolls[i];
    
    nsum =  mean*(rollsSize+n) -msum;
    if(nsum>n*6 || nsum/n<=0)
        *returnSize=0;
    
    else{
        int div = nsum/n, rem = nsum%n, idx =0;
        while(n--)
            if(rem-->0)
                ans[idx++]=div+1;
            else
                ans[idx++]=div;
    }
    return ans;
}