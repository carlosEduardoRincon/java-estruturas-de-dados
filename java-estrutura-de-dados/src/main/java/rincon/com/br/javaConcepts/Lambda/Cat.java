package rincon.com.br.javaConcepts.Lambda;

public class Cat implements Printable {

    public String name;
    public int age;

    public Cat() {

    }

    @Override
    public String print(String prefix, String suffix) {
        return "";
    }

//    @Override
//    public void print() {
//        System.out.println(
//                "Name: "
//                        + name
//                        + " , Age: "
//                        + age
//        );
//    }
}
