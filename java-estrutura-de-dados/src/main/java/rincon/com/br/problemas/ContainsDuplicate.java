package rincon.com.br.problemas;

import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] orderArray = new int[]{1,2,3,4,5,6,6,8,9,10,11,12};
        System.out.println(containsDuplicate(orderArray));
    }

    public static boolean containsDuplicate(int[] orderArray) {
        HashMap<Integer, Integer> controlDuplicate =  new HashMap<>();

        for (int num : orderArray) {
            if (controlDuplicate.get(num) != null) {
                return true;
            } else {
                controlDuplicate.put(num, 1);
            }
        }
        return false;
    }
}
