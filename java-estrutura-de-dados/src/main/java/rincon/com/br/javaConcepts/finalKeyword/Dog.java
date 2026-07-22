package rincon.com.br.javaConcepts.finalKeyword;

public class Dog extends Animal {
    private int walkDistancePreferente;

    public void bark() {
        System.out.println("woof");
    }

    public int getWalkDistancePreferente() {
        return walkDistancePreferente;
    }

    public void setWalkDistancePreferente(int walkDistancePreferente) {
        this.walkDistancePreferente = walkDistancePreferente;
    }

    public void eat() {
        System.out.println("mom mom mom" + FinalExample.PI);
    }
}
