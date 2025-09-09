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
    int sum=0,low,high;
    public void preorder(TreeNode temp){
        if(temp==null)
            return;
        preorder(temp.left);
        if(low<=temp.val && temp.val<=high)
            sum+=temp.val;
        preorder(temp.right);
    }
    public int rangeSumBST(TreeNode root, int l, int h) {
        low=l;
        high=h;
        preorder(root);
        return sum;
    }
}