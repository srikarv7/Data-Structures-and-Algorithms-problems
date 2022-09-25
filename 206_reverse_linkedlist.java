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
        
        Stack<Integer> stack = new Stack<Integer>();
        ListNode pointer = head;
        while(pointer!=null){
            stack.push(pointer.val);
            pointer = pointer.next;
        }
        ListNode pointer1 = head;
        while(!stack.isEmpty())
        {
            head.val = stack.pop();
            head  = head.next;
        }
        return pointer1;
    }
}