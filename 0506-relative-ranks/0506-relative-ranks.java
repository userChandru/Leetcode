class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++)
            pairs[i] = new int[] { i, score[i] };

        Arrays.sort(pairs, (x, y) -> (y[1] - x[1]));

        String[] ans = new String[n];

        ans[pairs[0][0]] = "Gold Medal";
        if (n > 1)
            ans[pairs[1][0]] = "Silver Medal";
        if (n > 2)
            ans[pairs[2][0]] = "Bronze Medal";
        if (n > 3)
            for (int i = 3; i < n; i++)
                ans[pairs[i][0]] = String.valueOf(i + 1);

        return ans;
    }
}