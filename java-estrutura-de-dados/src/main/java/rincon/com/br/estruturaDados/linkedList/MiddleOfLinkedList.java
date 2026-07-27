package rincon.com.br.estruturaDados.linkedList;

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

