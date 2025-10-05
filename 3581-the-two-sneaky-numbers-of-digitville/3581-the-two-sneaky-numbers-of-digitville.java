class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length-2, i=0;
        int ans[]= new int[2];
        int freq[] = new int[n];
        Arrays.fill(freq,0);
        for(int num: nums){
            if(i==2)
                return ans;
            if(freq[num]++ == 1)
                ans[i++] = num;
        }
        return ans;
    }
}