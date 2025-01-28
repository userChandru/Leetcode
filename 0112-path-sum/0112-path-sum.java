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
    
    public boolean preorder(TreeNode root, int targetSum, int currSum){
        if(root == null)
            return false;
        int sum = currSum + root.val;
        if(sum == targetSum && root.left == null && root.right == null)
            return true;
        return preorder(root.left, targetSum, sum) || preorder(root.right, targetSum, sum);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.val == targetSum && root.left == null && root.right==null)
            return true;
        int currSum=0;
        return preorder(root, targetSum, currSum);
    }
}