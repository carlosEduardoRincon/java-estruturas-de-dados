package rincon.com.br.javaConcepts.innerClass;

public class Main {

    public static void main(String[] args) {
        OuterClass other = new OuterClass();
        other.heyThere();

        OuterClass.InnerClass inner = other.new InnerClass();
        inner.whatsUp();

        OuterClass.StaticInnerClass otherInner = new OuterClass.StaticInnerClass();
        otherInner.whatsUp();
    }
}
