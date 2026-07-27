package rincon.com.br.javaConcepts.abstractClasses;

public class AbstractExample {

    public static void main(String[] args) {
        // Can't instanciate
        // Animal animal = new Animal();

        Cat myCat = new Cat();
        myCat.makeNoise();
    }
}
