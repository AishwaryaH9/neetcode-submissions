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
        if(head == null || head.next == null)
            return;
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode mid = null;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(mid != null)
        {
             ListNode next = mid.next;
             mid.next = prev;
             prev = mid;
             mid = next;
        }

        ListNode first = head;
        mid = prev;

        while (mid != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = mid.next;

            first.next = mid;
            mid.next = temp1;

            first = temp1;
            mid = temp2;
        }





    }
}
