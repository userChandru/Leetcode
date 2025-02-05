// Recursive Programming
// class Solution {
//     int nums[];
//     private boolean dfs(int curr){
//         if(curr >= nums.length-1)
//             return true;
//         int currJump = nums[curr];
//         for(int i=1; i<=currJump; i++){
//             int newPos = curr + i;
//             boolean willReach = dfs(newPos);
//             if(willReach)
//                 return true;
//         }
//         return false;
//     }
//     public boolean canJump(int[] numsArr) {
//         nums = numsArr;
//         return dfs(0);
//     }
// }

class Solution {
    int nums[];
    private boolean dfs(int curr){
        if(curr >= nums.length-1)
            return true;
        int currJump = nums[curr];
        for(int i=1; i<=currJump; i++){
            int newPos = curr + i;
            boolean willReach = dfs(newPos);
            if(willReach)
                return true;
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i=0; i<nums.length; i++){
            if(maxReach < i)
                return false;

            int jump = i+ nums[i];
            maxReach = Math.max(maxReach, jump);
        }
        return true;
    }
}

// class Solution {
//     public boolean canJump(int[] nums) {
       
//     }
// }