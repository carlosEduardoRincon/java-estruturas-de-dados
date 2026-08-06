package rincon.com.br.sorting;

import rincon.com.br.dataStructure.linkedList.ListNode;

import java.util.Arrays;

/*
    Divide and conquer.
    Use fast and slow pointers

    Advantage:
        - Better with LinkedLists

    Time complexity (depends on the pivot selected):
        - O(n log n)
    Space Complexity:
        - O (n)
 */
public class MergeSort {

    public static void main(String[] args) {

        // Lista: 4 -> 2 -> 1 -> 3 -> 5
        ListNode head = new ListNode(
                4,
                new ListNode(
                        2,
                        new ListNode(
                                1,
                                new ListNode(
                                        3,
                                        new ListNode(5)
                                )
                        )
                )
        );

        System.out.println("Lista original:");
        printList(head);

        head = sort(head);

        System.out.println("\nLista ordenada:");
        printList(head);
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static ListNode sort(ListNode head) {
        return mergeSort(head);
    }

    private static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var middle = findMiddle(head);
        var afterMiddle = middle.next;
        middle.next = null;
        var left = mergeSort(head);
        var right = mergeSort(afterMiddle);

        return merge(left, right);
    }

    private static ListNode findMiddle(ListNode head){
        var slow = head;
        var fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        var head = new ListNode();
        var tail = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) {
            tail.next = l1;
        } else if (l2 != null) {
            tail.next = l2;
        }

        return head.next;
    }

}
