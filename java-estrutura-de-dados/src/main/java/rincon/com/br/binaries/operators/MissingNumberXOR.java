package rincon.com.br.binaries.operators;

public class MissingNumberXOR {

    public static void main(String[] args) {

        int[] nums = {
            0,1,3,4
        };

        int x = 0;
        for (int num: nums) {
            x ^= num;
        }

        for (int i = 0; i < nums.length+1; i++) {
            x ^= i;
        }

        System.out.println(x);
    }
}
