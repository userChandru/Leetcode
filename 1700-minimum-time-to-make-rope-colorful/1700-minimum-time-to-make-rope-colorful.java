class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int n = colors.length();

        for (int i = 1; i < n; i++) {
            int max = 0;
            while (i < n && colors.charAt(i) == colors.charAt(i - 1)) {
                ans += neededTime[i - 1];
                max = Math.max(max, neededTime[i - 1]);
                i++;
            }
            ans += neededTime[i - 1];
            max = Math.max(max, neededTime[i - 1]);
            if (max != 0)
                ans -= max;
        }
        return ans;
    }
}