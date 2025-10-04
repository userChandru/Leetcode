class Solution {
    public int maxArea(int[] height) {
        int i=0, j=height.length-1;
        int max=0;
        while(i<j){
            int a=height[i], b= height[j];
            int curr = (a<b ? a : b) * Math.abs(i-j);
            if(max<curr)
                max = curr;
            if(a<b)
                i++;
            else 
                j--;
        }
        return max;
    }
}