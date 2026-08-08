package rincon.com.br.binaries.operators;

/*
    AND (where there exists a 0 in both stills 0, where there exist 0 and 1 stills 0)
    0000 0111
    &
    0000 0101
    ---------
    0000 0101

    OR (where there exists a 1 still 1)
    0100 0111
    |
    0000 0101
    ---------
    0100 0111

    NOT (found the complement to be 1)
    0 -> 1
    1 -> 0

    ~ 0101 = 7
    ---------
      1010 = -6

     ~ 0111 = 7
    ---------
       1000 = -8

    XOR (where there exists a 1 in both will be 0)
    0100 0111
    ^
    0000 0101
    ---------
    0100 0010 2 + 64=66

    0000 0101
    ^
    0000 0101
    ---------
    0000 0000 = 0

 */

public class Main {

    public static void main(String[] args) {
        int x = 5;      // 0101 em binário
        int y = 3;      // 0011 em binário

        // AND (&)
        System.out.println("x & y = " + (x & y));   // 1 (0001)

        // OR (|)
        System.out.println("x | y = " + (x | y));   // 7 (0111)

        // NOT (~)
        System.out.println("~x = " + (~x));         // -6

        // XOR (^)
        System.out.println("x ^ y = " + (x ^ y));   // 6 (0110)
    }
}
