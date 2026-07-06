package rincon.com.br.strings;

import java.util.Arrays;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        System.out.println(solution("-bcd"));
    }

    public static String solution(String input) {
        char[] inputChars = input.toCharArray();

        int left = 0;
        int rigth = inputChars.length - 1;

        while (left < rigth) {
            if (Character.isLetterOrDigit(inputChars[left])
                    && Character.isLetterOrDigit(inputChars[rigth])) {
                char aux = inputChars[left];
                inputChars[left] = inputChars[rigth];
                inputChars[rigth] = aux;

                left += 1;
                rigth -= 1;
            } else if (Character.isLetterOrDigit(inputChars[left])) {
                rigth -= 1;
            } else if (Character.isLetterOrDigit(inputChars[rigth])) {
                left += 1;
            } else {
                left += 1;
                rigth -= 1;
            }
        }

        return Arrays.toString(inputChars);
    }
}
