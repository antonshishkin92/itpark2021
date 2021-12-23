package lesson10;


import lesson10.lesson10.inter.PrinterAndCheckable;

public class Printer extends AbstractPrinter implements PrinterAndCheckable {

    public Printer(String intro) {
        super("консоль");
    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("Печать из класса " + this.getClass().getName()+ " в " + getSource());
        //TODO: 4457
    }

    @Override
    public void print(int index){
        PrinterAndCheckable.super.print(index);
    }

    @Override
    public void otherPrint() {

    }
}
