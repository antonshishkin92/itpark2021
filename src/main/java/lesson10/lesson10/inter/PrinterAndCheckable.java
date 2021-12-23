package lesson10.lesson10.inter;

public interface PrinterAndCheckable extends Printable,Checkable{

    void otherPrint();

    default void print(int index){
Checkable.super.print(index);
Printable.super.print(index);
    }

}
