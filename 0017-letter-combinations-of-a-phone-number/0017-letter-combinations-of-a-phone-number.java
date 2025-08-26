class Solution {
    private static final Map<Character, char[]> map = new HashMap<>();
    static {
        map.put('2', new char[] { 'a', 'b', 'c' });
        map.put('3', new char[] { 'd', 'e', 'f' });
        map.put('4', new char[] { 'g', 'h', 'i' });
        map.put('5', new char[] { 'j', 'k', 'l' });
        map.put('6', new char[] { 'm', 'n', 'o' });
        map.put('7', new char[] { 'p', 'q', 'r', 's' });
        map.put('8', new char[] { 't', 'u', 'v' });
        map.put('9', new char[] { 'w', 'x', 'y', 'z' });
    }

    private List<String> ans;
    private StringBuilder temp;

    private void helper(String digits, int i) {
        if (temp.length() == digits.length()) {
            ans.add(temp.toString());
            return;
        }
        char[] letters = map.get(digits.charAt(i));
        for (char c : letters) {
            temp.append(c);
            helper(digits, i + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        temp = new StringBuilder();

        if (digits.isEmpty()) return ans;

        helper(digits, 0);
        return ans;
    }
}
