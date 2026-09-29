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
        
        int N = 0;
        ListNode dummy = head;
        while (dummy != null){
            N++;
            dummy = dummy.next;
        }
        ListNode curr = head;
        int removeIndex= N - n;
        if (removeIndex == 0){
            return head.next;
        }
        for (int i = 0; i < removeIndex; i++){
            if (i == removeIndex - 1){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
