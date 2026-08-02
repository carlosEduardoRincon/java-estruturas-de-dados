package rincon.com.br.javaConcepts.staticKeyword;

public class Cat {

    // individual or different for every object: non-static
    // the same to class level: static

    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;

    public Cat() {
        catCount++;
        livesRemaining = MAX_LIVES;
    }

    public void meow() {
        System.out.println("Meow" + catCount);
    }

    public static int getCatCount() {
        // System.out.println(age); // not possible because it's no static field
        return catCount;
    }
}
