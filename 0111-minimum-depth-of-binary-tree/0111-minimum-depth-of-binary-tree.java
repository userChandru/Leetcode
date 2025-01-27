/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int minDistance = Integer.MAX_VALUE;

    public void traverse(TreeNode root, int currDepth) {
        if (root == null) 
            return;
        if (root.left == null && root.right == null)
            minDistance = (minDistance < currDepth) ? minDistance : currDepth;
        traverse(root.left, currDepth + 1);
        traverse(root.right, currDepth + 1);
    }

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int currDepth = 1;
        traverse(root, currDepth);
        return minDistance;
    }
}