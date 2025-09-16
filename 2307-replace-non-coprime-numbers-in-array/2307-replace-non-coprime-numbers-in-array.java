class Solution {
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public int lcm(int a, int b, int gcd) {
        return (int) (Math.abs((long) a * b) / gcd);
    }
        

    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add(num);
            while (result.size() > 1) {
                int a = result.get(result.size() - 2);
                int b = result.get(result.size() - 1);
                int g = gcd(a, b);
                if (g == 1) break;
                result.remove(result.size() - 1);
                result.remove(result.size() - 1);
                result.add(lcm(a, b, g));
            }
        }
        return result;
    }
}
