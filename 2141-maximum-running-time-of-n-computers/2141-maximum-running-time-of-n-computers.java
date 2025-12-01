class Solution {
    public boolean helper(int n, long k, int[] batteries) {
        long sum = 0;
        long target = n * k;

        for (int bat : batteries) {
            if (bat < k)
                sum += bat;
            else
                sum += k;

            if (sum >= target)
                return true;
        }

        return sum >= target;
    }

    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int bat : batteries)
            sum += bat;
        
        long l = 0;
        long r = sum / n;
        long ans = -1;

        while (l <= r) {
            long mid = (r + l) / 2;

            if (helper(n, mid, batteries)) {
                ans = mid;
                l = mid + 1;
            } 
            else
                r = mid - 1;
        }
        return ans;
    }
}