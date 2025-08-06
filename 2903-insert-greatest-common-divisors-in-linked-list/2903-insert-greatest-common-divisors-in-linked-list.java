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
    public int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null)    
            return head;
        ListNode temp = head;
        while(temp.next!=null){
            ListNode n = new ListNode(gcd(temp.val, temp.next.val), temp.next);
            temp.next = n;
            temp=n.next;
        }

        return head;
    }
}