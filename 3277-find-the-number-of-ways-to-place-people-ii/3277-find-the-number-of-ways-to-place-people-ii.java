class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });
        
        int count = 0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            int curr = points[i][1];
            int min = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                int temp = points[j][1];
                if (temp <= curr && temp > min) {
                    count++;
                    min = temp;
                    if (temp == curr) 
                        break;
                }
            }
        }
        return count;
    }
}
