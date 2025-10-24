class Solution {
    public int nextBeautifulNumber(int n) {
        for (int i = n + 1; i <= 1224444; i++) {
            int[] freq = new int[10];
            int num = i;
            boolean flag = true;

            while (num > 0) {
                freq[num % 10]++;
                num /= 10;
            }

            for (int j = 0; j < 10; j++) {
                if (j == 0 && freq[0] != 0) {
                    flag = false;
                    break;
                } else if (freq[j] != 0 && freq[j] != j) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
