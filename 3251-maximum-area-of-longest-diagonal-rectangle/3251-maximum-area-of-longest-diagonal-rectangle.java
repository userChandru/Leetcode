class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = 0;
        int area = 0;
        int x, y, curr, areaa;
        for (int[] dim : dimensions) {
            x = dim[0];
            y = dim[1];
            curr = x * x + y * y;
            areaa = x * y;
            if (maxDiag < curr) {
                maxDiag = curr;
                area = areaa;
            } else if (maxDiag == curr)
                area = Math.max(area, areaa);
        }
        return area;
    }
}