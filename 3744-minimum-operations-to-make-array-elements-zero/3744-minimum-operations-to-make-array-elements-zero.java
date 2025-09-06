class Solution {
    public int helper(int num) {
        int c = 0;
        while (num > 0) {
            num >>= 2;
            c++;
        }
        return c;
    }

    public long minOperations(int[][] queries) {
        long sum = 0;
        for (int[] i : queries) {
            long count = 0;
            int x = helper(i[0]);
            int y = helper(i[1]);

            count += (long) x * (i[1] - i[0] + 1);

            while (x < y) {
                count += i[1] - (long) Math.pow(4, x) + 1;
                x++;
            }
            sum += (count + 1) / 2;
        }
        return sum;
    }
}
