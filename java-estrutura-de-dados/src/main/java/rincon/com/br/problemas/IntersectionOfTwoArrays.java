package rincon.com.br.problemas;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int [] firstArray = new int[]{1,2,2,1,3};
        int [] secondArray = new int[]{2,2,3};

        System.out.println(
                Arrays.toString(intersection(firstArray, secondArray))
        );

        System.out.println(
                Arrays.toString(intersection2(firstArray, secondArray))
        );
    }

    public static Object[] intersection(int[] firstArray, int[] secondArray) {
       HashMap<Integer, Integer> intersectionMap = new HashMap<>();

       for (int num : firstArray) {
           intersectionMap.putIfAbsent(num, 1);
       }

        for (int num : secondArray) {
            if (intersectionMap.get(num) != null) {
                intersectionMap.put(num, 2);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Integer key : intersectionMap.keySet()) {
            if (intersectionMap.get(key) > 1) {
                result.add(key);
            }
        }

        return result.toArray();
    }

    public static Object[] intersection2(int[] firstArray, int[] secondArray) {
        Set<Integer> map1 = new HashSet<>();
        Set<Integer> map2 = new HashSet<>();

        for (int num : firstArray) {
            map1.add(num);
        }

        for (int num : secondArray) {
            map2.add(num);
        }

        map1.retainAll(map2);

        return map1.toArray();
    }
}
