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
    public void reorderList(ListNode head) {
        ListNode mid = middle(head);
        ListNode th = mid.next;
        mid.next = null;
        th = reverse(th);
        connect(head, th);
    }
    public void connect(ListNode head, ListNode th) {
        ListNode c1 = head, c2 = th;
        while(c1 != null && c2 != null) {
            ListNode f1 = c1.next;
            ListNode f2 = c2.next;
 
            c1.next = c2;
            c2.next = f1;
 
            c1 = f1;
            c2 = f2;
        }
    }
    public ListNode reverse(ListNode head) {
        ListNode p = null, c = head;
        while(c != null) {
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        head = p;
        return head;
    }
    public ListNode middle(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}