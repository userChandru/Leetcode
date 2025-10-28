class Solution {
    Queue<String> ans;

    public void helper(int n, int i) {
        if (n == i)
            return;

        int size = ans.size();
        while (size > 0) {
            String temp = ans.poll();
            if (temp.charAt(temp.length() - 1) == '1') {
                ans.offer(temp + "0");
                ans.offer(temp + "1");
            } 
            else
                ans.offer(temp + "1");
            size--;
        }
        helper(n, i + 1);
    }

    public List<String> validStrings(int n) {
        ans = new LinkedList<>();
        ans.add("1");
        ans.add("0");
        helper(n, 1);
        return new ArrayList<>(ans);
    }
}