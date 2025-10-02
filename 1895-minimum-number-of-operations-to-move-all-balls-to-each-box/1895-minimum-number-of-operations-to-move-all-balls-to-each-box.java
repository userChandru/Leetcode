class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        for (int i = 1, count = 0; i < n; i++) {
            if (boxes.charAt(i - 1) == '1')
                count++;
            ans[i] = ans[i - 1] + count;
        }
        for (int i = n - 2, count = 0, sum = 0; i >= 0; i--) {
            if (boxes.charAt(i + 1) == '1')
                count++;
            sum += count;
            ans[i] += sum;
        }
        return ans;
    }
}