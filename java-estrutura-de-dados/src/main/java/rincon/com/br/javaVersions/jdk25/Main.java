import static java.lang.IO.println;
import module java.base;

/*
    Compact Object Headers: menor consumo de memória para armazenar dados/cabeçalhos
    internos do java. 8 bytes -> 4 bytes

    Import Declarations: evita o "import hell"
    import module.java.base.*; -> lang, util, time, ...

*/


// Compact Source Files
// Métodos podem ser declarados fora de uma classe
void main() {
    //System.out.println("Hello and welcome");
    println("Hello");
}


// Pattern Matching com Tipos Primitivos
// Switch com expressões lógicas
void testeSwitch () {

    var num = 4;

    var resultado = switch(num) {
        case 0 -> "Zero";
        case int n when n > 0 && n <= 3 -> "Pequeno";
        case int n when n > 3 && n < 10 -> "Médio";
        default -> "Grande";
    };

    println(resultado);
}
