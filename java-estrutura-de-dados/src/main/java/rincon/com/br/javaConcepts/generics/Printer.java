package rincon.com.br.javaConcepts.generics;

import rincon.com.br.javaConcepts.finalKeyword.Animal;

import java.io.Serializable;

// public class Printer<T> {
// public class Printer<T extends Serializable> {
public class Printer<T extends Animal & Serializable, V extends Animal & Serializable> {

    T thingToPrint;
    V otherThing;

    public Printer(T thingToPrint, V otherThing) {
        this.thingToPrint = thingToPrint;
        this.otherThing = otherThing;
    }

    public void print() {
        otherThing.eat();
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}
