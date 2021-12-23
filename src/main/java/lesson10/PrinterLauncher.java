package lesson10;

import lesson10.lesson10.inter.Printable;

public class PrinterLauncher {
    public static void main(String[] args) {
        Printable printable= new FilePrinter();
        printable.print();
        System.out.println(Printable.INDEX);
        Printable.print("Hello world");
        printable.print(123);

    }
}
