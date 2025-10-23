class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length(), idx=0;
        int arr[] = new int[n];
        for(char ch:s.toCharArray())
            arr[idx++] = ch-'0';

       for(int i=0; i<n-2; i++){
            int temp = arr[0];
            for(int j=1; j<n-i; j++){
                int sum=(temp+arr[j])%10;
                temp = arr[j];
                arr[j-1] = sum;
            }
        }
        return arr[0]==arr[1];
    }
}