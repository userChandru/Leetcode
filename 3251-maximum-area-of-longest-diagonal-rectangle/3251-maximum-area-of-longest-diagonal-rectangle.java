class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = 0;
        int area = 0;
        for(int[] dim: dimensions){
            int x= dim[0], y=dim[1];
            int curr = x*x + y*y;
            if(maxDiag < curr){
                maxDiag = curr;
                area = x*y; 
            }
            if(maxDiag == curr && area< x*y)
                area=x*y;
        }
    return area;
    }
}