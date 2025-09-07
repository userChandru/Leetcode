class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        int i=0, n=candyType.length / 2;
        for (int c : candyType)
            if(hs.add(c)){
                i++;
                if(i>=n)
                    return n;
            }         
        return hs.size();
    }
}