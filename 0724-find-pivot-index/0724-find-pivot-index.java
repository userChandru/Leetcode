class Solution {
    public int pivotIndex(int[] arr) {
              int n=arr.length;
        int idx=0, sum=0, total=0;
        for(int i=0; i<n; i++)
            total +=arr[i];
        for( ; idx<n; idx++){
            total -= arr[idx];
            if(sum==total)
                return idx;
            sum += arr[idx];
        }
        return -1;
    }
}