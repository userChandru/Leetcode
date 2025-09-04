class Solution {
    public int findClosest(int x, int y, int z) 
    {
        int a = Math.abs(z-x);
        int b = Math.abs(z-y);
        if(a==b){
            System.gc();
            return 0;
        }
        if(a<b) {

            System.gc();
            return 1;
        }
        System.gc();
        return 2;
    }
}