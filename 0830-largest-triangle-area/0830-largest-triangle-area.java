class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        int n = points.length;
        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++) {
                    double curr = area(points[i], points[j], points[k]);
                    if (curr > max)
                        max = curr;
                }
        return max;
    }

    public double area(int[] a, int[] b, int[] c) {
        double curr = 0.5 * (a[0] * (b[1] - c[1]) + b[0] * (c[1] - a[1]) + c[0] * (a[1] - b[1]));
        return Math.abs(curr);
    }
}