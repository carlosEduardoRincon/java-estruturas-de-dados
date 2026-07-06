package rincon.com.br.strings;

public class TestStrings {

    public static void main(String[] args) {

        String a = "123";
        String b = "123";

        System.out.println(a == b);
        System.out.println(a.equals(b));

        a = "1234";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = "123";
        String d = c;

        System.out.println(c == d);
        System.out.println(c.equals(d));

    }
}
