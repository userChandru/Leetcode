class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int count = 0;
        int freq[] = new int[n+1];
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            if(A[i]==B[i])
                count++;
            else{
                freq[A[i]]++;
                if(freq[A[i]]==0)
                    count++;
                freq[B[i]]--;
                if(freq[B[i]]==0)
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}