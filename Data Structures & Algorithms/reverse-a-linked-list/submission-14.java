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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        // start recursion until end of list
        ListNode p = reverseList(head.next);
        // reverse pointer
        head.next.next = head;
        // delete old pointer
        head.next = null;
        return p;
    }
}
