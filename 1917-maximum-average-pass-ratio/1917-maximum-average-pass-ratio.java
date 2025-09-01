class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> queue = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int i = 0; i < classes.length; i++) {
            double curr = (double) classes[i][0] / classes[i][1];
            double next = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
            queue.offer(new double[] { next - curr, i });
        }

        while (extraStudents-- > 0) {
            double[] t = queue.poll();
            int i = (int) t[1];
            classes[i][0] += 1;
            classes[i][1] += 1;
            double curr = (double) classes[i][0] / classes[i][1];
            double next = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
            queue.offer(new double[] { next - curr, i });
        }

        double ans = 0.0;
        for (int[] c : classes)
            ans += (double) c[0] / c[1];

        return ans / classes.length;
    }
}