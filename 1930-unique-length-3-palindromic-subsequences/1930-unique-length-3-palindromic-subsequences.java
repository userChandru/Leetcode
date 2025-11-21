class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray())
            set.add(c);

        for (char c : set) {
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);

            if (start < end) {
                Set<Character> charSet = new HashSet<>();
                for (int i = start + 1; i < end; i++)
                    charSet.add(s.charAt(i));
                ans += charSet.size();
            }
        }

        return ans;        
    }
}