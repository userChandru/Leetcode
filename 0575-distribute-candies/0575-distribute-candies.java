class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for (int c : candyType)
            hs.add(c);
        int n = candyType.length, c = hs.size();
        return c < n / 2 ? c : n / 2;
    }
}