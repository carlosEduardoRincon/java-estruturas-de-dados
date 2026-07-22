package rincon.com.br.estruturaDados.linkedList;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode newList = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = newList;
            newList = head;
            head = nextNode;
        }

        return newList;
    }
}
