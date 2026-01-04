class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        Arrays.fill(row, 100001);
        
        for(int i = 0; i<m; i++)
            for(int j=0; j<n; j++)
                row[i] = Math.min(row[i], matrix[i][j]);

        for(int j=0; j<n; j++)
            for(int i = 0; i<m; i++)
                col[j] = Math.max(col[j], matrix[i][j]);
        Set<Integer> set = new HashSet<>();
        
        for(int num: row)
            if(!set.add(num))
                ans.add(num);
        
        for(int num: col)
            if(!set.add(num))
                ans.add(num);
        
        return ans;
    }
}