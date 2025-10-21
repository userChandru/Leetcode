class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int m = points.length;
        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<m; j++){
                int x1 = points[j][0];
                int y1 = points[j][1];
                int x2 = queries[i][0];
                int y2 = queries[i][1];
                double r = queries[i][2];
                double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
                if(dist<=r)
                    count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}