class Solution {
    public long maxPower(int[] stations, int r, int k) {
        long low = 0, high = 0;
        for (int i : stations) 
            high += i;
        high += k;

        long ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (helper(stations, r, k, mid)) {
                ans = mid;
                low = mid + 1;
            } 
            else
                high = mid - 1;
        }
        return ans;
    }

    private boolean helper(int[] stations, int r, long k, long target) {
        int n = stations.length;
        long[] add = new long[n];
        long used = 0, sum = 0;

        for (int i = 0; i <= r && i < n; i++)
            sum += stations[i];

        for (int i = 0; i < n; i++) {
            if (i - r - 1 >= 0) 
                sum -= stations[i - r - 1] + add[i - r - 1];
            if (i + r < n && i != 0) 
                sum += stations[i + r] + add[i + r];
            if (sum < target) {
                long need = target - sum;
                if (used + need > k) 
                    return false;
                used += need;
                add[Math.min(n - 1, i + r)] += need;
                sum += need;
            }
        }
        return true;
    }
}
