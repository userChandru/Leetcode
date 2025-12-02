class Solution {
    public int countTrapezoids(int[][] points) {
        long MOD = 1000000007L;
        HashMap<Integer, Long> map = new HashMap<>();
        for (int[] p : points)
            map.put(p[1], map.getOrDefault(p[1], 0L) + 1);
        ArrayList<Long> list = new ArrayList<>();
        for (long k : map.values())
            if (k >= 2) 
                list.add((k * (k - 1) / 2) % MOD);
        
        long sum = 0, ans = 0;
        for (long v : list) {
            ans = (ans + v * sum) % MOD;
            sum = (sum + v) % MOD;
        }
        return (int) ans;
    }
}