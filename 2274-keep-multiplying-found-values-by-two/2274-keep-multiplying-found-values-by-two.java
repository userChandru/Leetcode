class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        int ans = original;
        for(int num: nums)
            set.add(num);
        while(set.contains(ans))
            ans*=2;
        return ans;
    }
}