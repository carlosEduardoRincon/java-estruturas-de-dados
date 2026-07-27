package rincon.com.br.dataStructure.linkedList.problems;

import rincon.com.br.dataStructure.linkedList.ListNode;

public class ReverseLinkedListTest {
    public static void main(String[] args) {

        ReverseLinkedList solution = new ReverseLinkedList();

        // Cenário 1: Lista vazia
        testar(solution, null);

        // Cenário 2: Lista com 1 elemento
        testar(solution, criarLista(1));

        // Cenário 3: Lista com 2 elementos
        testar(solution, criarLista(1, 2));

        // Cenário 4: Lista com 5 elementos
        testar(solution, criarLista(1, 2, 3, 4, 5));

        // Cenário 5: Lista com 6 elementos
        testar(solution, criarLista(10, 20, 30, 40, 50, 60));
    }

    private static void testar(ReverseLinkedList solution, ListNode head) {

        System.out.print("Lista original: ");
        imprimirLista(head);

        ListNode listaInvertida = solution.reverseList(head);

        System.out.print("Lista invertida: ");
        imprimirLista(listaInvertida);

        System.out.println("-----------------------------");
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

        if (head == null) {
            System.out.println("Lista vazia");
            return;
        }

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
