class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=friends.length;
        int[] ans = new int[n];
        int idx=0;
        Set<Integer> group = new HashSet<>();
        for(int i : friends)
            group.add(i);
        for(int i : order){
            if(idx==n)
                break;
            if(group.contains(i))
                ans[idx++]=i;
        }    
        return ans;
    }
}