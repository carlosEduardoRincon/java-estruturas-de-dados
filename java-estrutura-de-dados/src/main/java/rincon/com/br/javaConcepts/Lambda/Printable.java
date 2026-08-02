package rincon.com.br.javaConcepts.Lambda;

// Lambdas just able to exist one abstract method
@FunctionalInterface
public interface Printable {

    String print(String prefix, String suffix);

//    void doThing(); // not possbile
}
