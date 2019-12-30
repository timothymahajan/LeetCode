// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 
	ListNode head = new ListNode(0);
	ListNode result = head;
	int carry = 0;

	while (l1 != null || l2 != null || carry > 0) {
		int total = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
		result.next = new ListNode(total % 10);
		carry = total / 10;
		l1 = l1 == null ? null : l1.next;
		l2 = l2 == null ? null : l2.next;
		result = result.next
	}

	return head.next;
    } 
}
