package rincon.com.br.dataStructure.linkedList.problems;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import rincon.com.br.dataStructure.linkedList.ListNode;

public class ValidPalindromeLinkedList {

    // Força bruta
    public static boolean isPalindrome(ListNode listNode) {
        List<Integer> list = new ArrayList<>();

        var aux = listNode;
        while (aux != null) {
            list.add(aux.val);
            aux = aux.next;
        }

        var reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);

        return list.equals(reversedList);
    }

    // Solução ideal
    public static boolean isPalindrome2(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        // 1. Encontrar o meio
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Se a lista tem quantidade ímpar de elementos,
        // avança uma posição para ignorar o elemento do meio.
        if (fast != null) {
            slow = slow.next;
        }

        // 2. Inverter a segunda metade
        ListNode secondHalf = reverse(slow);

        // 3. Comparar as metades
        ListNode firstHalf = head;
        ListNode currentSecond = secondHalf;

        while (currentSecond != null) {
            if (firstHalf.val != currentSecond.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            currentSecond = currentSecond.next;
        }

        return true;
    }

    private static ListNode reverse(ListNode head) {

        ListNode previous = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }

        return previous;
    }
}
