class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        char arr[] = columnTitle.toCharArray();
        for(char c : arr)
        {
            int d = c - 'A' + 1;
            ans = ans * 26 + d;
        }
        return ans;
    }
}