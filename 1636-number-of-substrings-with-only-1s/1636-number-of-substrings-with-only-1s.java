class Solution {
    public int numSub(String s) {
        long ans = 0;
        long count = 0;
        char[] arr = s.toCharArray();
        for (char c : arr)
            if (c == '1') {
                count++;
                ans = (ans + count) % 1000000007;
            } 
            else
                count = 0;

        return (int)ans;
    }
}
