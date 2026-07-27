package rincon.com.br.estruturaDados.linkedList;

public class TestMiddleOfLinkedList {
    public static void main(String[] args) {

        MiddleOfLinkedList solution = new MiddleOfLinkedList();

        // Cenário 1: Lista com 1 elemento
        ListNode lista1 = criarLista(1);
        testar(solution, lista1);

        // Cenário 2: Lista com 2 elementos
        ListNode lista2 = criarLista(1, 2);
        testar(solution, lista2);

        // Cenário 3: Lista com 3 elementos
        ListNode lista3 = criarLista(1, 2, 3);
        testar(solution, lista3);

        // Cenário 4: Lista com 4 elementos
        ListNode lista4 = criarLista(1, 2, 3, 4);
        testar(solution, lista4);

        // Cenário 5: Lista com 5 elementos
        ListNode lista5 = criarLista(1, 2, 3, 4, 5);
        testar(solution, lista5);

        // Cenário 6: Lista vazia
        ListNode lista6 = null;
        testar(solution, lista6);
    }

    private static void testar(MiddleOfLinkedList solution, ListNode head) {
        imprimirLista(head);

        ListNode meio = solution.findMiddle(head);

        if (meio != null) {
            System.out.println("Meio: " + meio.val);
        } else {
            System.out.println("Lista vazia.");
        }

        System.out.println("-------------------------");
    }

    private static ListNode criarLista(int... valores) {
        if (valores.length == 0) {
            return null;
        }

        ListNode head = new ListNode(valores[0]);
        ListNode atual = head;

        for (int i = 1; i < valores.length; i++) {
            atual.next = new ListNode(valores[i]);
            atual = atual.next;
        }

        return head;
    }

    private static void imprimirLista(ListNode head) {
        System.out.print("Lista: ");

        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }

        System.out.println();
    }
}
