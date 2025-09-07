class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for (int c : candyType)
            hs.add(c);
        return Math.min(hs.size(), candyType.length / 2);
    }
}