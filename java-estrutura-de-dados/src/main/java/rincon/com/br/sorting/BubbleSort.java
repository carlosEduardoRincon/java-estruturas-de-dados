package rincon.com.br.sorting;

import java.util.Arrays;

/*
    Always the bigger number will be at the last position.

    Advantage:
        - Space complexity;
        - Don't need another data structure, just use the input array;
        - Good for less than 100 items.

    Time complexity:
        - Best case: O(n)
        - Average case: O(n²)
        - Worst Case: O(n²)
    Space Complexity: O(1)

 */
public class BubbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{5}))); // [5]

        System.out.println(Arrays.toString(sort(new int[]{}))); // []

        System.out.println(Arrays.toString(sort(new int[]{5, 4, 3, 2, 1}))); // [1, 2, 3, 4, 5]

        System.out.println(Arrays.toString(sort(new int[]{1, 2, 3, 4, 5}))); // [1, 2, 3, 4, 5]

        System.out.println(Arrays.toString(sort(new int[]{3, 3, 2, 1, 2}))); // [1, 2, 2, 3, 3]

        System.out.println(Arrays.toString(sort(new int[]{-5, 10, 0, -1}))); // [-5, -1, 0, 10]
    }

    public static int[] sort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            var isSorted = true;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                if (isSorted) {
                    return arr;
                }
            }
        }
        return arr;
    }
}
