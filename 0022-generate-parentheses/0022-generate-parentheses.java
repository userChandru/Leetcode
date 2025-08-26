class Solution {
    List<String> ans;
    StringBuilder temp = new StringBuilder();

    public void helper(int n, int open, int close) {
        if (open == close && temp.length() == 2 * n)
            ans.add(temp.toString());
        else {
            if (open < n) {
                temp.append("(");
                helper(n, open + 1, close);
                temp.deleteCharAt(temp.length() - 1);
            }
            if (close < open) {
                temp.append(")");
                helper(n, open, close + 1);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public List<String> generateParenthesis(int n) {
        ans = new LinkedList<>();
        this.helper(n, 0, 0);
        return ans;
    }
}