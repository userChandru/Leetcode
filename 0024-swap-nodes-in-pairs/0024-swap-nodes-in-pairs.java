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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode curr = head;
        ListNode nex = curr.next;
        ListNode prev = null;
        head = nex;
        while(curr!=null && nex!=null ){
            curr.next= nex.next;
            nex.next=curr;
            if(prev!=null)
                prev.next = nex;
            prev = curr;
            curr=curr.next;
            if(curr!=null)
                nex=curr.next;

        }
        return head;
    }
}