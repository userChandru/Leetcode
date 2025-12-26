class Solution {
    public int maxDistinct(String s) {
        boolean seen[] = new boolean[26];
        char arr[] = s.toCharArray();
        int ans = 0;
        for (char ch : arr)
            if (!seen[ch - 'a']) {
                ans++;
                seen[ch - 'a'] = true;
            }
        return ans;
    }
}