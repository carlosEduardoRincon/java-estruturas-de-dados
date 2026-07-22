package rincon.com.br.javaConcepts.finalKeyword;

// A final class can't have a child class, in another word the final class can't be extended
public /*final*/ class Animal {

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // A final method makes it impossible to override by a child class
    public /*final*/ void eat() {
        System.out.println("munch munch munch");
    }
}
