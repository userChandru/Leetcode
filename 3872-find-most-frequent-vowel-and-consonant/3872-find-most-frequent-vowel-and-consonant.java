class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int con = 0, vow = 0;

        for (char c : s.toCharArray()) 
            freq[c - 'a']++;

        for (int i = 0; i < 26; i++) {
            int count = freq[i];
            if ("aeiou".indexOf(i + 'a') >= 0)
                vow = Math.max(vow, count);
            else
                con = Math.max(con, count);
        }
        return con + vow;
    }
}

















































































