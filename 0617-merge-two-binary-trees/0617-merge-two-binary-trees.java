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
    public TreeNode helper(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) 
            return null;
        else if (tree1 == null)
            return tree2;
        else if (tree2 == null) 
            return tree1;
    
        TreeNode temp = new TreeNode(tree1.val + tree2.val);
    
        temp.left = helper(tree1.left, tree2.left);
        temp.right = helper(tree1.right, tree2.right);
        
        return temp;
    }
    
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return helper(root1, root2);
    }
}