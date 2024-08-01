int findNonMinOrMax(int* nums, int numsSize){
    if(numsSize<3) return -1;
    int n1=nums[0], n2=nums[1], n3=nums[2];

    if(n1 < n2 && n2 < n3 || n1 > n2 && n2 > n3)
        return n2;
    else if(n2 < n1 && n1 < n3 || n1 < n2 && n1 > n3)
        return n1;
    return n3;

}