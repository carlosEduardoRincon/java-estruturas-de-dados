package rincon.com.br.javaConcepts.staticKeyword;

public class Main {

    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;

        System.out.println(Cat.getCatCount());
        System.out.println(Cat.MAX_LIVES);
        // Cat.meow(); not possible
    }
}
