package rincon.com.br;

import java.util.Arrays;

public class TwoPointer_ReverseWordInAString {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords2("Let's take LeetCode contest"));
        System.out.println(reverseStr3("abcdefg", 8));
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


    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = s.length();

        for (int i = 0; i < n; i += 2 * k) {
            if (i + k - 1 <= n - 1) {
                reverseK(i, i + k - 1, str);
            } else {
                reverseK(i, n - 1, str);

            }
        }

        String revStr = new String(str);
        return revStr;
    }

    public void reverseK(int i, int j, char[] str) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}
