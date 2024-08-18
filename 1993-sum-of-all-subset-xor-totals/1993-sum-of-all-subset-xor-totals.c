int subsetXORSum(int* nums, int numsSize) {
    int *ans=(int*)malloc(sizeof(int));
    int temp=0;
    *ans=0;
    helper(nums, numsSize, 0, temp, ans);
    return *ans;
}
void helper(int* nums, int numsSize, int i, int temp, int* ans){
    if(i==numsSize){
        *ans+=temp;
    }
    else{
        // int t=temp;
        // temp=temp^nums[i];
        helper(nums, numsSize, i+1, temp, ans);
        helper(nums, numsSize, i+1, temp^nums[i], ans);
    }
}