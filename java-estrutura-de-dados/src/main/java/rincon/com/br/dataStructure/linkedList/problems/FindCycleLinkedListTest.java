package rincon.com.br.dataStructure.linkedList.problems;

import rincon.com.br.dataStructure.linkedList.ListNode;

public class FindCycleLinkedListTest {

    public static void main(String[] args) {

        FindCycleLinkedList solution = new FindCycleLinkedList();

        // Cenário 1 - Lista vazia
        testar(solution, null);

        // Cenário 2 - Um elemento sem ciclo
        testar(solution, criarLista(1));

        // Cenário 3 - Vários elementos sem ciclo
        testar(solution, criarLista(1, 2, 3, 4, 5));

        // Cenário 4 - Ciclo no meio da lista
        testar(solution, criarListaComCiclo());

        // Cenário 5 - Um único nó apontando para ele mesmo
        testar(solution, criarAutoCiclo());

        // Cenário 6 - Dois nós formando um ciclo
        testar(solution, criarCicloDoisNos());
    }

    private static void testar(FindCycleLinkedList solution, ListNode head) {
        boolean possuiCiclo = solution.findCycle(head);

        System.out.println("Possui ciclo? " + possuiCiclo);
        System.out.println("----------------------------");
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

    // 1 -> 2 -> 3 -> 4 -> 5
    //           ^         |
    //           |_________|
    private static ListNode criarListaComCiclo() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        return n1;
    }

    // 1 -> 1
    private static ListNode criarAutoCiclo() {
        ListNode node = new ListNode(1);
        node.next = node;
        return node;
    }

    // 1 -> 2
    // ^    |
    // |____|
    private static ListNode criarCicloDoisNos() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);

        n1.next = n2;
        n2.next = n1;

        return n1;
    }
}

