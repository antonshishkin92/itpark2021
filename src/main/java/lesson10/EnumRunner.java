package lesson10;

import lesson10.enumeration.Language;
import lesson10.lesson10.inter.Printable;

public class EnumRunner {
    public static void main(String[] args) {
        Printable printable= new Printer("");
        printable.printHelloWorld(Language.French);

        printable.printHelloWorld(Language.as(3));

        System.out.println(Language.French.asString());
    }
}
