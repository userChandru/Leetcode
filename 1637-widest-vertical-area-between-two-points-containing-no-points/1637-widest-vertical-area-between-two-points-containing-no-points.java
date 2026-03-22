class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int max = 0;
        int n = points.length;
        for (int i = 1; i < n; i++) {
            int temp = points[i][0] - points[i - 1][0];
            max = Math.max(max, temp);
        }

        return max;
    }
}