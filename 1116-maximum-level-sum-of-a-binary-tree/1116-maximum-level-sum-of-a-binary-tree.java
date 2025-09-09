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
    int max=Integer.MIN_VALUE, ans=1;
    Queue<TreeNode> que;
    public int bfs(Queue<TreeNode> que, int i){
        if(que.isEmpty())
            return ans;
        int sum=0, size = que.size();
        while(size-- > 0){
            TreeNode curr = que.poll();
            if(curr.left!=null)
                que.add(curr.left);
            if(curr.right!=null)
                que.add(curr.right);
            sum+=curr.val;
        }
        if(sum>max){
            max=sum;
            ans=i;
        }
        return bfs(que, i+1);

    }
    public int maxLevelSum(TreeNode root) {
        que = new LinkedList<>();
        que.add(root);
        return bfs(que, 1);

    }
}