class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) 
            arr.add(new ArrayList<>());
        for(int[] i : edges) {
            arr.get(i[0]).add(i[1]);
            arr.get(i[1]).add(i[0]);
        }
        int[] ans = new int[1];
        helper(arr,values,0,-1,ans,k);
        return ans[0];
    }
    public int helper(List<List<Integer>> arr, int[] values, int node, int prev, int[] ans, int k) {
        int sum = values[node];
        for(int temp : arr.get(node))
            if(temp != prev)
                sum += helper(arr,values,temp,node,ans,k);

        if(sum % k == 0) 
            ans[0]++;
        return sum % k;
    }
}