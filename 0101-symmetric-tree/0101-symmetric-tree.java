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
    public boolean symmetric(TreeNode a, TreeNode b){
        if(a==null && b==null)
            return true;
        if((a==null && b!=null) || (a!=null && b==null) || a.val!=b.val )
            return false;
        return symmetric(a.left, b.right) && symmetric(a.right, b.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);
    }
}