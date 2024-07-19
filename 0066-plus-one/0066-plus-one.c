int* plusOne(int* digits, int digitsSize, int* returnSize) {
    int* ans = (int*)malloc(sizeof(int)*(digitsSize + 1));
    *returnSize = digitsSize;
    for(int i=0;i<digitsSize; i++)
        ans[i+1]=digits[i];
    ans[0]=0;
    int sum = ans[digitsSize]+1;
    int rem = sum%10;
    sum/=10;
    if(sum){
        int n=digitsSize-1;
        do{
            if(n==0 && sum==1){
                ans[0]+=1;
                *returnSize=digitsSize+1;
                printf("-%d-\n",*returnSize);
                break;
            }
            ans[n]+=sum;
            sum=ans[n]/10;
            ans[n]%=10;
            n--;
        }while(sum);
    }
    ans[digitsSize]=rem;
    if(*returnSize==digitsSize) return (ans+1);
    return ans;
}