package rincon.com.br.javaConcepts.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        // Checked: compile time extends exception (compilation error: IOException/SQLException)
        try {
            readFile("myFile.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Unchecked: extends RuntimeException (Ex.: Nullpointer, NumberFormatException, IndexOutOfBounds)
        String name = null;
        printLength(name);
    }

    private static void readFile(String fileName) throws FileNotFoundException {
// 1º option
//        try {
//            FileReader reader = new FileReader(fileName);
//        } catch (FileNotFoundException ex) {
//            System.out.println("File doesn't exists");
//        }

        FileReader reader = new FileReader(fileName);
    }

    private static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        } catch(NullPointerException npe) {
            System.out.println("String can't be null");
        }
    }


//  Compile error
//    private static void throwsChecked() {
//        throw new Exception();
//    }

    // No error
    private static void throwsUnchecked() {
        throw new RuntimeException();
    }
}
