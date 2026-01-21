/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0;
    int max = 0;
    
    public void helper(TreeNode curr, int height){
        if(curr==null)
            return;
        helper(curr.left, height+1);
        helper(curr.right, height+1);
        if(curr.left == null && curr.right==null){
            if(height>max){
                max=height;
                ans=0;
            }
            if(height == max)
                ans+=curr.val;
        }
    }
    public int deepestLeavesSum(TreeNode root) {
        helper(root,0);
        return ans;
    }
}