package rincon.com.br.estruturaDados.linkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public void addToFront(int value) {
        var newNode = new Node(value);
        newNode.setNext(head);
        if (head != null) {
            head.setPrevious(newNode);
        } else {
            tail = newNode;
        }
        head = newNode;
    }

    public void addToTail(int value) {
        var newNode = new Node(value);
        newNode.setPrevious(tail);
        if (tail != null) {
            tail.setNext(newNode);
        } else {
            head = newNode;
        }
        tail = newNode;
    }

    public int removeFromFront() {
        if (head == null) {
            return -1;
        }

        var removedValue = head.getValue();
        head = head.getNext();
        if (head != null) {
            head.setPrevious(null);
        } else {
            tail = null;
        }

        return removedValue;
    }

    public int removeFromEnd() {
        if (tail == null) {
            return -1;
        }

        var removedValue = tail.getValue();
        tail = tail.getPrevious();
        if (tail != null) {
            tail.setNext(null);
        } else {
            head = null;
        }

        return removedValue;
    }


}

