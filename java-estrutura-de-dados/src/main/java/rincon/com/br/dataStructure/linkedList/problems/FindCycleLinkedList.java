package rincon.com.br.dataStructure.linkedList.problems;

import rincon.com.br.dataStructure.linkedList.ListNode;

// Tortoise and Hare Algorithm / Floyd's Cycle Detection Algorithm
// Time: O(n)
// Space: O(1)
public class FindCycleLinkedList {

    public boolean findCycle(ListNode listNode) {
        ListNode head = listNode;
        ListNode ahead = listNode;
        while (head != null &&  ahead != null && ahead.next != null) {
            head = head.next;
            ahead = ahead.next.next;
            if (head == ahead) {
                return true;
            }
        }
        return false;
    }
}
