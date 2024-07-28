long long concatInt(int a, int b){
    long long t=a;
    int sB=log10(b)+1;
    while(b || sB){
        t = t*10 + b/pow(10,--sB);
        b%=(int)pow(10,sB);
    }
    return t;
}

long long findTheArrayConcVal(int* nums, int numsSize){
    long long ans=0;
    int n=numsSize-1;
    for(int i=0; i<=(n-i); i++){
        if(i==n-i) {
            ans+=nums[i];
            break;
        }
        ans+=concatInt(nums[i],nums[n-i]);
    }

    return ans;
}
