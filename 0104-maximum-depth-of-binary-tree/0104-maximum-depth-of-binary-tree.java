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
    int max=0;
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;

        // int curr=0;
        // if(root.left == null && root.right==null)
        //     return 1;
        // if(root.left!=null){
        //     curr = maxDepth(root.left)+1;
        //     max = max > curr ? max : curr;
        // }
        // if(root.right!=null){
        //     curr = maxDepth(root.right)+1;
        //     max = max > curr ? max : curr;
        // }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}