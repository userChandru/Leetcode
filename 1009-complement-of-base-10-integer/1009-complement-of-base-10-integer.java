class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0)
            return 1;

        int len = Integer.toBinaryString(n).length();
        int temp = (1 << len) - 1;

        return n ^ temp;
    }
}