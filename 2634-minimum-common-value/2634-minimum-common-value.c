int getCommon(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    if(nums1[nums1Size-1]<nums2[0] || nums1[0]>nums2[nums2Size-1])
        return -1;
    int  i=0, j=0;
    while(i<nums1Size || j<nums2Size){
        if(nums1[i]==nums2[j])
            return nums1[i];
        if(nums1[i]>nums2[j])
            j++;
        else if(nums1[i]<nums2[j])
            i++;
        if(i==nums1Size || j==nums2Size)
            return -1;
    }
    return -1;
}