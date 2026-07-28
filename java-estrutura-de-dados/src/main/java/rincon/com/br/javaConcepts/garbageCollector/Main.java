package rincon.com.br.javaConcepts.garbageCollector;

import rincon.com.br.javaConcepts.abstractClasses.Cat;

public class Main {

    public static void main(String[] args) {
        doCatStuff(); // When the method return, Cat will not exist anymore
        // And if the variable doesn't exist, the pointing will not exist either
        // At final, the only thing that exists is the object at memory without pointing
        // Garbage Collector comes to clear;
        // By default, the algorithm of GB is Mark-and-Sweep algorithm, that checks
        // if the objects have references pointing
        // After removing all the unused objects they are moved, to
        // young gen memory to an old gen memory, this old gen memory
        // will not be often searched;
        System.out.println("I'm done doing cat stuff.");
    }

    private static void doCatStuff() {
        Cat myCat = new Cat(); // Until this variable is pointing to the object, it will be not excluded from memory
        myCat.makeNoise();

        myCat = new Cat(); // Here, the old Cat Object in memory will not have a reference pointing
        myCat.makeNoise();
    }
}
