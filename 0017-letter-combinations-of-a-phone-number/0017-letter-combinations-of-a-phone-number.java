class Solution {

    List<String> ans;
    StringBuilder temp;
    static Map<Character, Character[]> map = new HashMap<>();
    static {
        map.put('2', new Character[] { 'a', 'b', 'c' });
        map.put('3', new Character[] { 'd', 'e', 'f' });
        map.put('4', new Character[] { 'g', 'h', 'i' });
        map.put('5', new Character[] { 'j', 'k', 'l' });
        map.put('6', new Character[] { 'm', 'n', 'o' });
        map.put('7', new Character[] { 'p', 'q', 'r', 's' });
        map.put('8', new Character[] { 't', 'u', 'v' });
        map.put('9', new Character[] { 'w', 'x', 'y', 'z' });
    }

    public void helper(String digits, int i) {
        if (temp.length() == digits.length()){
            ans.add(temp.toString());
            return;
        }       
        for (Character c : map.get(digits.charAt(i))) {
            temp.append(c);
            helper(digits, i + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        ans = new LinkedList<>();
        temp = new StringBuilder();
        if(digits.length()==0)
            return ans;

        map.put('2', new Character[] { 'a', 'b', 'c' });
        map.put('3', new Character[] { 'd', 'e', 'f' });
        map.put('4', new Character[] { 'g', 'h', 'i' });
        map.put('5', new Character[] { 'j', 'k', 'l' });
        map.put('6', new Character[] { 'm', 'n', 'o' });
        map.put('7', new Character[] { 'p', 'q', 'r', 's' });
        map.put('8', new Character[] { 't', 'u', 'v' });
        map.put('9', new Character[] { 'w', 'x', 'y', 'z' });
        this.helper(digits, 0);
        return ans;
    }
}