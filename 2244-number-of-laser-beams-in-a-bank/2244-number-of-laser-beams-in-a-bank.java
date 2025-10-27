class Solution {
    public int helper(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++)
            count += (s.charAt(i) - '0');
        return count;
    }

    public int numberOfBeams(String[] bank) {
        int ans = 0, temp = helper(bank[0]);
        int n = bank.length;
        for (int i = 1; i < n; i++) {
            int count = helper(bank[i]);
            if (count == 0)
                continue;
            ans += temp * count;
            temp = count;
        }
        return ans;
    }
}