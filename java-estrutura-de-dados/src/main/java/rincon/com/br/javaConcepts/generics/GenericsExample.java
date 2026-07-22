package rincon.com.br.javaConcepts.generics;

import rincon.com.br.javaConcepts.finalKeyword.Animal;
import rincon.com.br.javaConcepts.finalKeyword.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
//        Printer<Integer> printerInteger = new Printer<>(23);
//        printerInteger.print();
//
//        Printer<String> printerString = new Printer<>("String");
//        printerString.print();


        Printer<Dog, Dog> printerDog = new Printer<>(new Dog(), new Dog());
        printerDog.print();

        shout(printerDog, 20);

        // --------------------------------------------------

//        List<Integer> intList = new ArrayList<>();
//        intList.add(3);
//        printList(intList);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        printList(dogList);
    }

    private static <T,V> T shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + " " + otherThingToShout + "!!!!");
        return thingToShout;
    }

    // ? wildcard, when you don't know the generic type is going to be
    private static void printList(List<? extends Animal> list) {
        System.out.println();
    }
}
