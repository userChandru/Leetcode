class Solution {
    public String replaceDigits(String s) {
        char letters[] = s.toCharArray();
        int n = letters.length;
        for(int i=1; i<n; i+=2)
            letters[i] = (char)((int)letters[i-1]+(int)letters[i]-'0');
        return new String(letters);
    }
}