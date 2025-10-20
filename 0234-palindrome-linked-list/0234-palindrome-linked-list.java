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
    public boolean isPalindrome(ListNode head) {

        int n=0;
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
            if(prev.val != temp.val)
                return false;
            prev=prev.next;
            temp=temp.next;
        }
        return true;
    }
}