package rincon.com.br.javaConcepts.abstractClasses;

public interface AnimalStuff {
    // In interfaces, if you have fields, it needs to declare
    // the value, and all subclasses that implement
    // will use the same value
    int age = 1;
    String name = "Larry";

    void poop();
}
