class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;

        long[] arr = new long[n];
        
        for (int i = 0; i < m; i++) {
            long curr = mana[i], min = arr[0]; 
            
            for (int j = 1; j < n; j++) 
                min = Math.max(min + (long) skill[j - 1] * curr, arr[j]);
            
            arr[n - 1] = min + (long) skill[n - 1] * curr;
            
            for (int j = n - 2; j >= 0; j--)
                arr[j] = arr[j + 1] - (long) skill[j + 1] * curr;
        }
        
        return arr[n - 1];
    }
}