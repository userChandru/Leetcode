class Solution {
    public boolean helper(int n){
        while(n>0){
            if(n%10==0)
                return false;
            n/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++)
            if (helper(i) && helper(n-i) )
                return new int[]{i, n-i};
        return new int[0];
    }
}