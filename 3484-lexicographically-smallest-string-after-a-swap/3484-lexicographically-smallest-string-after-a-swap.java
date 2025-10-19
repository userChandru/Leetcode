class Solution {
    public String getSmallestString(String s) {
        StringBuilder ans = new StringBuilder(s);
        int n = ans.length(), i = 0;
        while (i < n - 1) {
            char a = ans.charAt(i), b = ans.charAt(i + 1);
            if (a % 2 == b % 2 && a > b) {
                char t = ans.charAt(i);
                ans.setCharAt(i, ans.charAt(i + 1));
                ans.setCharAt(i + 1, t);
                return ans.toString();
            }
            i++;
        }
        return s;
    }
}