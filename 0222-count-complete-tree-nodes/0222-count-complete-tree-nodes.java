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
    int ans = 0;

    public void helper(TreeNode curr, int left, int height) {
        if (curr == null) {
            ans++;
            return;
        }
        if (left == height)
            return;
        helper(curr.right, left, height + 1);
        helper(curr.left, left, height + 1);
    }

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int left = 0;
        TreeNode temp = root;
        while (temp != null) {
            temp = temp.left;
            left++;
        }
        int total = (1 << left) - 1;
        helper(root, left, 1);
        return total - ans;
    }
}