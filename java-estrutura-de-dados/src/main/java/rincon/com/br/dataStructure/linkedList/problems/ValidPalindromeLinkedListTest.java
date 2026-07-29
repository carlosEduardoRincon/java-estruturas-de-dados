package rincon.com.br.dataStructure.linkedList.problems;

import rincon.com.br.dataStructure.linkedList.ListNode;

public class ValidPalindromeLinkedListTest {

    public static void main(String[] args) {

        // Cenário 1 - Lista vazia
        testar(criarLista());

        // Cenário 2 - Um elemento
        testar(criarLista(1));

        // Cenário 3 - Dois elementos iguais
        testar(criarLista(1, 1));

        // Cenário 4 - Dois elementos diferentes
        testar(criarLista(1, 2));

        // Cenário 5 - Palíndromo com quantidade ímpar
        testar(criarLista(1, 2, 3, 2, 1));

        // Cenário 6 - Não é palíndromo (ímpar)
        testar(criarLista(1, 2, 3, 4, 5));

        // Cenário 7 - Palíndromo com quantidade par
        testar(criarLista(1, 2, 2, 1));

        // Cenário 8 - Não é palíndromo (par)
        testar(criarLista(1, 2, 3, 4));

        // Cenário 9 - Todos os elementos iguais
        testar(criarLista(5, 5, 5, 5, 5));
    }

    private static void testar(ListNode head) {

        System.out.print("Lista: ");
        imprimirLista(head);

        boolean resultado = ValidPalindromeLinkedList.isPalindrome2(head);

        System.out.println("É palíndromo? " + resultado);
        System.out.println("--------------------------------");
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
