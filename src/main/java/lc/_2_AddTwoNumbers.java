package lc;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

public class _2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode list = head;
        int carry = 0;

        int ret = 0;
        while (l1 != null || l2 != null) {
            ret = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = ret / 10;

            list.next = new ListNode(ret % 10);
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
            list = list.next;
        }
        if (carry > 0) {
            list.next = new ListNode(carry);
        }
        return head.next;
    }
}
