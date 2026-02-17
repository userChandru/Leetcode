class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++)
            pairs[i] = new int[] { i, score[i] };

        Arrays.sort(pairs, (x, y) -> (y[1] - x[1]));

        String[] ans = new String[n];

        for (int i = 0; i < n; i++)
            if (i == 0)
                ans[pairs[i][0]] = "Gold Medal";
            else if (i == 1)
                ans[pairs[i][0]] = "Silver Medal";
            else if (i == 2)
                ans[pairs[i][0]] = "Bronze Medal";
            else
                ans[pairs[i][0]] = String.valueOf(i + 1);

        return ans;
    }
}