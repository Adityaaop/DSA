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
        if(head == null) {//If there is no linked list then there is nothing to remove
            return null;
        }
	//two pointers to traverse over the linked list with a gap of n
        ListNode prev = head;
        ListNode curr = head;
	//creating the gap of n between prev and the curr pointer
        for(int i = 0; i < n; i++) {
            curr = curr.next;
        }
	//if curr is null, it means the question has asked us to remove the first node
	//get the address of the second node and return the address
        if(curr == null) {
            ListNode nh = head.next;
            head.next = null;
            head = nh;
            return head;
        }
	//keep traversing the curr pointer till the end until the prev pointer reach the node address just behind the one to remove
        while(curr.next != null) {
            prev = prev.next;
            curr = curr.next;
        }
 
	//remove the node
        ListNode n1 = prev.next;
        ListNode n2 = n1.next;
        n1.next = null;
        prev.next = n2;
        return head;
    }
}