/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode();

        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null && list2 != null) {
            return list2;
        } else if (list2 == null && list1 != null) {
            return list1;
        } else {

            if (list1.val <= list2.val) {
                sortedList.val = list1.val;
                list1 = list1.next;
                System.out.println("The value of the sortedList is: " + sortedList.val);
                // System.out.println("The value of list 1 is: " + list1.val);
            } else {
                sortedList.val = list2.val;
                list2 = list2.next;
                System.out.println("The value of the sortedList is: " + sortedList.val);
                // System.out.println("The value of list 2 is: " + list2.val);
            }

            ListNode p1 = list1;
            ListNode p2 = list2;
            ListNode pointer = sortedList;

            // boolean abrupt = false;

            while (p1 != null && p2 != null) {
                System.out.println("The value of p1 and p2 is: ");
                if (p1.val <= p2.val) {
                    ListNode p = new ListNode(p1.val);
                    pointer.next = p;
                    System.out.println("The value inserted into the sortedList is: " + p.val);
                    p1 = p1.next;
                    pointer = pointer.next;
                } else {
                    ListNode p = new ListNode(p2.val);
                    pointer.next = p;
                    System.out.println("The value inserted into the sortedList is: " + p.val);
                    p2 = p2.next;
                    pointer = pointer.next;
                }

            }

            if (p1 == null) {
                System.out.println("P1 is null");
                pointer.next = p2;
            } else if (p2 == null) {
                System.out.println("p2 is null");
                pointer.next = p1;
            }
            return sortedList;

        }

    }
}