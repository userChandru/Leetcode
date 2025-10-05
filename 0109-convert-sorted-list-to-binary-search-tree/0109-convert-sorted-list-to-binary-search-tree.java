/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ListNode temp;
    public TreeNode helper(int i, int j){
        if(i>j)
            return null;
        TreeNode left = helper(i, (i+j)/2-1);
        TreeNode curr = new TreeNode(temp.val);
        temp = temp.next;
        TreeNode right = helper((i+j)/2+1, j);

        curr.left = left; 
        curr.right = right;
        return curr; 
    }
    public TreeNode sortedListToBST(ListNode head) {
        temp = head;
        int n=0;
        while(temp != null){
            n++;
            temp=temp.next;
        }
        temp=head;
        return helper(0,n-1);
    }
}