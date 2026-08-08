package rincon.com.br.binaries.operators;

public class NumberOfStepsToReduceNumberToZero {

    public static void main(String[] args) {

        int steps = 0;
        int num = 14;
        while (num > 0) {
            if ((num & 1) == 1) {
                // odd
                num -= 1;
            } else {
                // even
                num >>= 1;
            }
            steps += 1;
        }

        System.out.println("Steps: " + steps);
    }
}
