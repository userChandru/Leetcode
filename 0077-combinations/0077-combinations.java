class Solution {
    List<List<Integer>> ans = new LinkedList<>();
    int n;
    int k;

    public void helper(List<Integer> temp, int curr) {
        if (temp.size() == k)
            ans.add(new LinkedList<>(temp));
        else if (curr > n)
            return;
        else while (curr <= n) {
                temp.add(curr);
                helper(temp, ++curr);
                temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;

        helper(new LinkedList<>(), 1);
        System.out.print(ans.size());
        return ans;
    }
}