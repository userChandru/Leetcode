class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;

        long[] temp = new long[n];
        for (int i = 1; i < n; i++) 
            temp[i] = temp[i - 1] + skill[i];

        long sum = (long) skill[0] * mana[0];

        for (int j = 1; j < m; j++) {
            long max = (long) skill[0] * mana[j];
            for (int i = 1; i < n; i++) {
                long diff = temp[i] * mana[j - 1] - temp[i - 1] * mana[j];
                if (diff > max) 
                    max = diff;
            }
            sum += max;
        }
        return sum + temp[n - 1] * mana[m - 1];
    }
}