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
    List<Integer> ans;
    public void traverse(TreeNode root, int level){
        if(root==null)
            return;
        if(level == ans.size())
            ans.add(root.val);
        traverse(root.right,level+1);
        traverse(root.left,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ans = new ArrayList<>();
        if(root == null)
            return ans;
        traverse(root,0);
        
        return ans;
    }
}