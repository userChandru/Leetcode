class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        int[] freq = new int[26];
        int n = s.length();
        for (int idx = 0; idx < n; idx++) {
            freq[s.charAt(idx) - 'a']++;
            freq[t.charAt(idx) - 'a']--;
        }
        for (int idx : freq)
            if (idx != 0)
                return false;
        return true;
    }
}