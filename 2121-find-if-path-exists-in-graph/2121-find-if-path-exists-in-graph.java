class Solution {
    int parent[];

    private int find(int node){
        if(parent[node] == -1)
            return node;
        return parent[node] = find(parent[node]);
    }
    private void union (int u, int v){
        int rootU = find(u);
        int rootV = find(v);
        if(rootU != rootV)
            parent[rootU] = rootV;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        Arrays.fill(parent,-1);
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            union(u,v);
        }
        int rootSource = find(source);
        int rootDestination = find(destination);
        return rootSource == rootDestination;
    }
}