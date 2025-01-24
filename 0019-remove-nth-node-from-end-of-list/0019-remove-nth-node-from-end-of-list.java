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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode temp = dummy;
        ListNode kth = dummy;
        while(n-- != 0)
            temp=temp.next;
        while( temp.next != null){
            temp= temp.next;
            kth= kth.next;
        }
        // if(kth == head)
        //     return head.next;
        kth.next= kth.next.next;
        return dummy.next;
    }
}