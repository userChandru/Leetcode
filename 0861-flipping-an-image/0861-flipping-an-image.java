class Solution {
    public void swap(int[] row, int i, int j){
        int t  = row[i];
        row[i] = row[j]^1;
        row[j] = t^1;
        if(i==j){
            row[i]^=1;
            row[j]^=1;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int row[]: image){
            int s=0, e=n-1;
            while(s<=e){
                swap(row, s, e);
                s++;
                e--;
            }
        }
        return image;
    }
}