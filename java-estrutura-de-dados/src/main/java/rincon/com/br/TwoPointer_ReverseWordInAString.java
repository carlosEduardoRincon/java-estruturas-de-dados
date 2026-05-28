package rincon.com.br;

import java.util.Arrays;

public class TwoPointer_ReverseWordInAString {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords2("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        int leftPointer = 0;
        int rightPointer = 0;

        var stringArray = s.toCharArray();
        while (rightPointer < s.length()) {
            if (stringArray[rightPointer] != ' ') {
                rightPointer += 1;
            } else {
                var initialRightPointer = rightPointer;
                for (int i = leftPointer; i < rightPointer-1; i++) {
                    var aux = stringArray[i];
                    stringArray[i] = stringArray[rightPointer-1];
                    stringArray[rightPointer-1] = aux;
                    rightPointer--;
                }

                rightPointer = initialRightPointer + 1;
                leftPointer = rightPointer;
            }
        }

        for (int i = leftPointer; i < rightPointer-1; i++) {
            var aux = stringArray[i];
            stringArray[i] = stringArray[rightPointer-1];
            stringArray[rightPointer-1] = aux;
            rightPointer--;
        }

        StringBuilder response = new StringBuilder();
        return String.valueOf(response.append(stringArray));
    }

    public static String reverseWords2(String s) {
        String [] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word: words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }
        result.deleteCharAt(result.length()-1);

        return result.toString();
    }

}
