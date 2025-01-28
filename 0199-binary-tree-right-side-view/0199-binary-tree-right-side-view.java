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
    List<List<Integer>> levelOrder;
    public void traverse(TreeNode root, int level){
        if(root==null)
            return;
        if(level == levelOrder.size())
            levelOrder.add(new ArrayList<>());
        levelOrder.get(level).add(root.val);
        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        levelOrder = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        traverse(root,0);
        for(int i=0; i<levelOrder.size(); i++){
            ans.add(levelOrder.get(i).get(levelOrder.get(i).size()-1));
        }
        return ans;
    }
}