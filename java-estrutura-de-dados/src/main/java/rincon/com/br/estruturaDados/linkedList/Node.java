package rincon.com.br.estruturaDados.linkedList;

public class Node {

    private int value;
    private Node next;
    private Node previous;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public int getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public void setPrevious(Node node) {
        this.previous = node;
    }
}
