package lesson10;

import lesson10.lesson10.inter.Checkable;
import lesson10.lesson10.inter.Printable;
import lesson10.lesson10.inter.PrinterAndCheckable;

public class FilePrinter extends AbstractPrinter implements PrinterAndCheckable {

    public FilePrinter() {
        super("файл");
    }


    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void print() {
        //TODO: размещение текста в файле
    }

    @Override
    public void otherPrint() {

    }
}
