int countPairs(int* nums, int numsSize, int target)    {
    int count = 0;
    for (size_t i = 0; i < numsSize; i++)
        for (size_t j = i + 1; j < numsSize; j++)
            if (nums[i] + nums[j] < target) 
                count++;
    
    return count;
}