char* triangleType(int* nums, int numsSize) {
    char* ans;
    if(nums[0]==nums[1] && nums[1]==nums[2] && nums[2]== nums[0]){
        ans=(char*)malloc(11);
        ans="equilateral";
        return ans;
    }
    for(int i=0; i<3; i++){
        if(!(nums[(i+2)%3] < nums[i]+nums[(i+1)%3])){
            ans=(char*)malloc(4);
            ans="none";
            return ans;
        }
    }
    if(nums[0]!=nums[1] && nums[1] != nums[2] && nums[2]!= nums[0]){
        ans=(char*)malloc(7);
        ans="scalene";
        return ans;
    }
    else{
        ans=(char*)malloc(9);
        ans="isosceles";
        return ans;
    }
}