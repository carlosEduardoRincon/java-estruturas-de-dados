package rincon.com.br.algoritmos;

public class BinarySearch {

    public static void main(String[] args) {
        int [] orderArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};

        int position = foundNumberPosition(5, orderArray);
        System.out.println(position);


        position = foundNumberPosition(12, orderArray);
        System.out.println(position);

        position = foundNumberPosition(1, orderArray);
        System.out.println(position);
    }

    private static int foundNumberPosition(int number, int[] arr) {
        int leftPointer = 0;
        int rightPointer = arr.length;

        while (leftPointer < rightPointer) {

            int mid = (rightPointer + leftPointer) / 2;

            if (number == arr[mid]) {
                return mid;
            } else if (arr[mid] < number) {
                leftPointer = mid + 1;
            } else {
                rightPointer = mid - 1;
            }
        }

        return -1;
    }
}
