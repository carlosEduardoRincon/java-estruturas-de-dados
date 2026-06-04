package rincon.com.br;

import java.util.Arrays;

public class SlidinWindow {

    public static void main(String[] args) {
        System.out.println(biggerSubstring("bcbbbcba"));
    }

    public int maximumLengthSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 1;
        char [] src = s.toCharArray();

        Map<Character, Integer> counter = new HashMap<>();
        counter.put(src[0], 1);

        while (right < src.length - 1) {
            right += 1;

            if (counter.get(src[right]) != null) {
                int actualValue = counter.get(src[right]);
                counter.put(src[right], actualValue + 1);
            } else {
                counter.put(src[right], 1);
            }

            while (counter.get(src[right]) == 3) {
                int actualValue = counter.get(src[left]);
                counter.put(src[left], actualValue - 1);
                left += 1;
            }
            
            if (right - left + 1 > max) {
                max = right - left + 1;
            }
        }

        return max;
    }

}