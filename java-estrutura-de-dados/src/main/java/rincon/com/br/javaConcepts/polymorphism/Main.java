package rincon.com.br.javaConcepts.polymorphism;

public class Main {

    // Same thing, but with a different form (poly forms)
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog dog = new Dog();
        dog.eat();
    }
}
