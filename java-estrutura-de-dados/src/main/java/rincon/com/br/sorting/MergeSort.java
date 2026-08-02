package rincon.com.br.sorting;

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
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(sort(new int[]{5}))); // [5]
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(sort(new int[]{}))); // []
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(sort(new int[]{5, 4, 3, 2, 1}))); // [1, 2, 3, 4, 5]
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(sort(new int[]{1, 2, 3, 4, 5}))); // [1, 2, 3, 4, 5]
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(sort(new int[]{3, 3, 2, 1, 2}))); // [1, 2, 2, 3, 3]
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(sort(new int[]{-5, 10, 0, -1}))); // [-5, -1, 0, 10]
        System.out.println("---------------------------------");
    }

    public static int[] sort(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int[] mergeSort(int[] arr, int i, int i1) {
        return new int[]{};
    }
}
