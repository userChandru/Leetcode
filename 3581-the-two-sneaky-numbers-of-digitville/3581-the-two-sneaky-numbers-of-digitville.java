class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2];
        int n= nums.length;
        int idx=0;
        for(int i=0; i<n; i++){
            int num=Math.abs(nums[i]);
            if(num==10000)
                num=0;
            if(nums[num]<0)
                ans[idx++]=num;
            if(idx==2)
                return ans;
            nums[num] *= -1;
            if(nums[num]==0)
                nums[num]=-10000;
        }
        return ans;
    }
}


// class Solution {
//     public int[] getSneakyNumbers(int[] nums) {
//         int n=nums.length-2, i=0;
//         int ans[]= new int[2];
//         int freq[] = new int[n];
//         Arrays.fill(freq,0);
//         for(int num: nums){
//             if(i==2)
//                 return ans;
//             if(freq[num]++ == 1)
//                 ans[i++] = num;
//         }
//         return ans;
//     }
// }


