package rincon.com.br.estruturaDados.linkedList;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Lista vazia:");
        System.out.println("Remover da frente: " + list.removeFromFront()); // -1
        System.out.println("Remover do final: " + list.removeFromEnd());    // -1

        System.out.println("\nAdicionando elementos...");
        list.addToFront(20);
        list.addToFront(10);
        list.addToTail(30);

        // Lista esperada: 10 <-> 20 <-> 30

        System.out.println("\nRemovendo da frente:");
        System.out.println(list.removeFromFront()); // 10
        System.out.println(list.removeFromFront()); // 20
        System.out.println(list.removeFromFront()); // 30
        System.out.println(list.removeFromFront()); // -1

        System.out.println("\nNovo teste:");

        list.addToTail(10);
        list.addToTail(20);
        list.addToTail(30);

        // Lista esperada: 10 <-> 20 <-> 30

        System.out.println("\nRemovendo do final:");
        System.out.println(list.removeFromEnd()); // Esperado: 30
        System.out.println(list.removeFromEnd()); // Esperado: 20
        System.out.println(list.removeFromEnd()); // Esperado: 10
        System.out.println(list.removeFromEnd()); // Esperado: -1
    }
}
