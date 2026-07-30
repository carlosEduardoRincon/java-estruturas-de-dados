package rincon.com.br.javaConcepts.innerClass;

public class OuterClass {
    int number = 6;

    public void heyThere() {
        System.out.println("Hey there");

        class LocalInnerClass {
            String localInnerClassVariable = "Here's";

            public void printLocalInnerClassVariable() {
                System.out.println(localInnerClassVariable);
            }
        }

        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassVariable();
    }

    // Non-static innerClasse
    public class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's up!");
        }
    }

    // Static innerClasse
    public static class StaticInnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's up! Static Inner Class");
        }
    }
}
