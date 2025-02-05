class Solution {
    int[][] adj;
    int dest;
    List<List<Integer>> totalPaths;
    private void dfs(int curr, List<Integer> currPath){
        currPath.add(curr);
        if(curr==dest){
            totalPaths.add(new ArrayList<>(currPath));
            currPath.remove(currPath.size()-1);
            return;
        }
        for(int nei : adj[curr])
            dfs(nei, currPath);
        currPath.remove(currPath.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        totalPaths = new ArrayList<>();
        adj = graph;

        int n = graph.length;
        dest = n-1;
        List<Integer> currPath= new ArrayList<>();
        dfs(0, currPath);
        return totalPaths;
    }
}