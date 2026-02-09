class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k - 1; i++)
            ans.append(words[i] + " ");
        ans.append(words[k - 1]);
        return ans.toString();
    }
}