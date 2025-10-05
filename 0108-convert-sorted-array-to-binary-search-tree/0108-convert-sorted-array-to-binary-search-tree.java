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
    public TreeNode helper(int[] nums, int s, int e, TreeNode temp, int side){
        if(s>e)
            return null;
        int mid = (s+e)/2;
        TreeNode newTree = new TreeNode(nums[mid]);
        if(side==-1)
            temp.left = newTree;
        else
            temp.right = newTree;
        
        helper(nums, s, mid-1, newTree, -1);
        helper(nums, mid+1, e, newTree, 1);
        return newTree;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n= nums.length;
        TreeNode head = new TreeNode(nums[n/2]);
        helper(nums, 0, n/2-1, head, -1);
        helper(nums, n/2+1, n-1, head, 1);
        return head;
    }
}