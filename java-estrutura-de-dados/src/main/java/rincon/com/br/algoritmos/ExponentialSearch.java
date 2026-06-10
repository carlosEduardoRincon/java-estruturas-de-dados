package rincon.com.br.algoritmos;

public class ExponentialSearch {

    public static void main(String[] args) {
        int [] orderArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};

        int position = exponentialSearch(5, orderArray);
        System.out.println(position);

        position = exponentialSearch(12, orderArray);
        System.out.println(position);

        position = exponentialSearch(1, orderArray);
        System.out.println(position);

        position = exponentialSearch(50, orderArray);
        System.out.println(position);
    }

    private static int exponentialSearch(
            int target,
            int[] arr)
    {
        if (arr[0] == target) {
            return 0;
        }

        int arrLength = arr.length;
        int right = 1;

        while (right < arrLength && arr[right] < target) {
            right *= 2;
        }

        if (right >= arrLength) {
            right = arrLength - 1;
        }

        if (arr[right] == target) {
            return right;
        }

        return binarySearch(target, arr, right / 2, right);
    }

    private static int binarySearch(
            int target,
            int[] arr,
            int leftPointer,
            int rightPointer)
    {
        while (leftPointer < rightPointer) {

            int mid = (rightPointer + leftPointer) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] < target) {
                leftPointer = mid + 1;
            } else {
                rightPointer = mid - 1;
            }
        }

        return -1;
    }
}
