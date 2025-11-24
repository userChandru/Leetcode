class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new LinkedList<>();
        int n = 0;
        
        for (int num : nums) {
            n = ((n << 1) | num) % 5;
            ans.add(n == 0);
        }
        
        return ans;
    }
}
