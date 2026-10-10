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
        ListNode curr = head;
        int N = 0;

        while (curr != null){
            curr = curr.next;
            N++;
        }

        int insertIndex = N - n;
        if (insertIndex == 0) {
            return head.next;
        }

        curr = head;
        for (int i = 0; i < insertIndex; i++){
            if (i + 1 == insertIndex){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
