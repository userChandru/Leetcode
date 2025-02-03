class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<numCourses;i++)
            adj.add(new ArrayList<>());

        for(int[]preReq: prerequisites){
            int v = preReq[0];
            int u = preReq[1];
            adj.get(u).add(v);
        }
        int [] inDegree= new int[numCourses];

        for(int[]preReq: prerequisites){
            int v = preReq[0];
            int u = preReq[1];
            inDegree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++)
            if(inDegree[i]==0)
                q.add(i);
        
        while(!q.isEmpty()){
            int curr = q.poll();

            for(int n: adj.get(curr)){
                inDegree[n]--;
                if(inDegree[n]==0)
                    q.add(n);
            }
        }
        for(int i=0; i<numCourses; i++){
            if(inDegree[i] !=0)
                return false;
        }
        return true;
    }
}