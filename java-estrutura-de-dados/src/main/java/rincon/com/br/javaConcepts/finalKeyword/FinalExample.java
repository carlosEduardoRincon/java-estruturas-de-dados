package rincon.com.br.javaConcepts.finalKeyword;

public class FinalExample {

    // Example of real final utilization
    public static final double PI = 3.14159;

    public static void main(String[] args){
        // Makes possible to assign the object just one time, common use to constants
        /*final*/ Dog dog = new Dog();
        dog.eat();

        dog = new Dog();
    }
}
