package rincon.com.br.javaConcepts.Lambda;

public class Main {

    public static void main(String[] args) {
//        Cat myCat = new Cat();
//        myCat.print(",", ".");

        // Starts here, removing the access modifier, return type and function name
//        printThing(
//                public void print() {
//            System.out.println(
//                    "Name: "
//                            + name
//                            + " , Age: "
//                            + age
//            );
//        })

        // Here the result
        // printThing(() -> System.out.println("Meow"));

        // Another way
        // Printable lambdaPrintable = (s) -> System.out.println("Meow" + s);
        // printThing(lambdaPrintable);

        Printable lambdaPrintable = (p, s) -> p + "Meow" + s; // code as parameter
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print(" ","!");
    }
}
