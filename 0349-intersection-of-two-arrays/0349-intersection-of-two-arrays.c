/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersection(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    int seen[1001]={0}, j=0;
    int* ans = (int*)malloc(sizeof(int)*1000);
    for(int i=0; i<nums1Size; i++)
        seen[nums1[i]]=1;
    for(int i=0; i<nums2Size; i++)
        if(seen[nums2[i]]==1){
            ans[j++]=nums2[i];
            seen[nums2[i]]=0;
        }
    *returnSize = j;
    return ans;      
}