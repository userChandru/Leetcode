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
    int sum=0;
    public void preorder(TreeNode t){
        if(t==null)
            return;
        preorder(t.right);
        t.val+=sum;
        sum=t.val;
        preorder(t.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        preorder(root);
        return root;
    }
}