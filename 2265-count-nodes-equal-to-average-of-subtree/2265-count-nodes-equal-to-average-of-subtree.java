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
    int count = 0;

    public int helper(TreeNode curr) {
        if (curr == null)
            return 0;

        int left = helper(curr.left);
        int right = helper(curr.right);

        int sum = left % 1000000 + right % 1000000 + curr.val;
        int n = left / 1000000 + right / 1000000 + 1;

        if (Math.floor(sum / n) == curr.val)
            count++;
        return n * 1000000 + sum;
    }

    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }
}
