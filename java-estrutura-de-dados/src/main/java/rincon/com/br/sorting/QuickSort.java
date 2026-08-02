package rincon.com.br.sorting;

import java.util.Arrays;

/*
    Divide and conquer.
    Needs a pivot, that's used to divide the list in two sides.
    There exist someways to choose a pivot, the most common is to choose the middle.

    Advantage:
        - Better with arrays

    Time complexity (depends on the pivot selected):
        - Best case: O(n log n)
        - Average case: O(n log n)
        - Worst Case: O (n²) -> when the pivot is the smaller or bigger of the list
    Space Complexity:
        - Best case: O(n log n)
        - Average case: O(n log n)
        - Worst Case: O (n)
 */
public class QuickSort {

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
        return quickSort(arr, 0, arr.length - 1);
    }

    public static int[] quickSort(int[] arr, int left, int right) {

        for (int i = left; i <= right; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        if (left < right) {
            int pi = partition(arr, left, right);
            quickSort(arr, left, pi - 1);
            quickSort(arr, pi + 1, right);
        }
        return arr;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];

        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i += 1;
                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }

        int aux = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = aux;

        int pivotPosition = i+1;
        System.out.println("Pivot: " + pivotPosition);
        return pivotPosition;
    }
}
