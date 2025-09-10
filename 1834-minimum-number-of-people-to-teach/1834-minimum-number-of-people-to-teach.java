class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        List<Set<Integer>> langs = new ArrayList<>();
        for (int[] i : languages) {
            Set<Integer> set = new HashSet<>();
            for (int l : i) 
                set.add(l);
            langs.add(set);
        }

        Set<Integer> ans = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0] - 1, v = f[1] - 1;
            if (Collections.disjoint(langs.get(u), langs.get(v))) {
                ans.add(u);
                ans.add(v);
            }
        }

        if (ans.isEmpty()) 
            return 0;

        int maxCommon = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int u : ans) {
                if (langs.get(u).contains(i)) count++;
            }
            maxCommon = Math.max(maxCommon, count);
        }

        return ans.size() - maxCommon;
    }
}
