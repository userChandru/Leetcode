/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* circularGameLosers(int n, int k, int* returnSize){
    int arr[n], i=0,j=0;
    memset(arr, 0, sizeof(arr));

    while(arr[i]!=1){
        arr[i]=1;
        i=((++j)*k+i)%n;
    }
    *returnSize=n-j;
    int* ans = (int*)malloc(sizeof(int)*(n-j));
    for(int i=0,k=0; i<n; i++)
        if(arr[i]!=1)
            ans[k++]=i+1;
    return ans;
}