package rincon.com.br.dataStructure.hashMap;

import java.util.Arrays;

public class SmallestPalindromicRearrangement {

    public static void main(String[] args) {

        String palindromic = "baccab";
        System.out.println(smallestPalindromicRearrangement(palindromic));
    }

    // The strategy here is to order the array starting at index 0 and go to the half,
    // Because the other part will be exactly like the first part but inverted
    public static String smallestPalindromicRearrangement(String s) {
        int length = s.length();
        int half = length / 2;

        char[] letters = s.toCharArray();
        Arrays.sort(letters, 0, half);

        for (int i = 0; i < half; i++) {
            letters[length - i - 1] = letters[i];
        }

        return new String(letters);
    }

    public String smallestPalindrome(String s) {
        int length = s.length() / 2;
        int[] bucket = new int[26];

        for (int i = 0; i < length; i++) {
            bucket[s.charAt(i) - 'a'] += 1;
        }

        StringBuilder left = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (bucket[i] > 0) {
                left.append(String.valueOf((char) (i + 'a')).repeat(bucket[i]));
            }
        }

        String mid = s.length() % 2 != 0 ? String.valueOf(s.charAt(length)) : "";
        String right = new StringBuilder(left).reverse().toString();

        return left + mid + right;
    }
}
