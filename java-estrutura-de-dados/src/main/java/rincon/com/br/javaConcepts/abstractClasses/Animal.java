package rincon.com.br.javaConcepts.abstractClasses;

// Can't instanciated
public abstract class Animal {
    int age;
    String name;

    // Can't call, but the classes who implemented needs to declare a method
    // In force what the subclasses of animal need to have
    public abstract void makeNoise();

    public void printName() {
        System.out.println(this.name);
    }
}
