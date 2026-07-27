package rincon.com.br.dataStructure.linkedList.problems;

import rincon.com.br.dataStructure.linkedList.ListNode;

public class MiddleOfLinkedList {

    public ListNode findMiddle(ListNode head) {
        ListNode ahead = head;

        while (head != null && ahead != null && ahead.next != null) {
            head = head.next;
            ahead = ahead.next.next;
        }

        return head;
    }
}

