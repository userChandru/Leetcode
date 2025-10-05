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
    public TreeNode helper(int[] nums, int s, int e){
        if(s>e)
            return null;
        int mid = (s+e)/2;
        TreeNode newTree = new TreeNode(nums[mid]);
        
        newTree.left = helper(nums, s, mid-1);
        newTree.right = helper(nums, mid+1, e);

        return newTree;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n= nums.length;
        TreeNode head = new TreeNode(nums[n/2]);
        head.left = helper(nums, 0, n/2-1);
        head.right = helper(nums, n/2+1, n-1);
        return head;
    }
}