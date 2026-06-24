package rincon.com.br.problemas;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        String s = "leetcoda";
        String s1 = "loveleetcode";
        String s2 = "aabb";

        System.out.println(solution(s));
        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }

    public static int solution(String s){
        Map<Character, Integer> control = new HashMap<>();

        for (char sUnit: s.toCharArray()) {
            control.put(sUnit,
                    control.getOrDefault(sUnit,0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (control.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
