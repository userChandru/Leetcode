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
    List<String> ans;
    public void helper(TreeNode curr, String temp){
        
        if(curr == null)
            return;
    
        if(curr.left == null && curr.right == null){
            ans.add(temp + curr.val);
            return;
        }
        
        helper(curr.left, temp + curr.val + "->");
        helper(curr.right,temp + curr.val+ "->");
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new LinkedList<>();
        helper(root, "");
        return ans;
    }
}