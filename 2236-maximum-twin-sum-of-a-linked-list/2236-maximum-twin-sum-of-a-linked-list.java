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
class Solution {
    public int pairSum(ListNode head) {
        
        int max = 0;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        ListNode prev;
        ListNode curr;
        ListNode next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = null;
        curr = slow;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while(prev!=null){
            max=Math.max(max, temp.val+prev.val);
            prev=prev.next;
            temp=temp.next;
        }
        return max;
    }
}