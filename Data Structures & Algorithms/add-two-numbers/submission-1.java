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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // dummy node
        ListNode dummy = new ListNode(0);

        // tail pointer
        ListNode tail = dummy;

        // carry
        int carry = 0;

        // continue while nodes or carry exist
        while(l1 != null || l2 != null || carry != 0){

            // current values
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // total sum
            int sum = x + y + carry;

            // digit to store
            int digit = sum % 10;

            // new carry
            carry = sum / 10;

            // create new node
            tail.next = new ListNode(digit);

            // move tail
            tail = tail.next;

            // move lists
            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }
        }

        // return answer
        return dummy.next;
    }
}
