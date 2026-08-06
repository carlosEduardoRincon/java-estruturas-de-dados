package rincon.com.br.dataStructure.arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Can primitive types and objects
        String[] array = new String[10]; // Need to define the size
        String[] array2 = {"1", "2", "3"};
        // Can't add elements at the end
        array[0] = "0";
        // Can't remove elements

        System.out.println(array2[0]);
        System.out.println(array2.length);
        System.out.println(array2);

        // Only objects and wrapper types
        // <> diamond operator
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>(
                Arrays.asList("1", "2", "3")
        );
        arrayList2.add("4");
        arrayList2.set(0, "0");
        arrayList2.remove("0");
        arrayList2.remove(1);

        System.out.println(arrayList2.get(1));
        System.out.println(arrayList2.size());
        System.out.println(arrayList2);
    }
}
