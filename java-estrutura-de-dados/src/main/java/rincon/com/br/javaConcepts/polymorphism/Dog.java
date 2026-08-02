package rincon.com.br.javaConcepts.polymorphism;

public class Dog extends Animal {

    private int breed;

    public int getBreed() {
        return this.breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("nhami nhami");
    }
}
