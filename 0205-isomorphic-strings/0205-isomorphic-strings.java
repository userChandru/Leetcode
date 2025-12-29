class Solution {
    public boolean isIsomorphic(String s, String t) {

        int n = s.length();
        char word1[] = s.toCharArray();
        char word2[] = t.toCharArray();

        char seen1[] = new char[256];
        char seen2[] = new char[256];

        int i = 0;
        while (i < n) {

            int index1 = word1[i];
            int index2 = word2[i];

            if (seen1[index1] == 0 && seen2[index2] == 0) {
                seen1[index1] = word2[i];
                seen2[index2] = word1[i];
                i++;
            } else if (seen1[index1] == word2[i] && seen2[index2] == word1[i])
                i++;
            else
                break;
        }
        return i >= n;
    }
}