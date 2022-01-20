package lesson21;

import java.math.BigDecimal;

public class Refactoring {

   private String name;
    private String color;
    private BigDecimal price;
    private int size;

    public Refactoring(String name, String color, BigDecimal price,int size){

        print();
    }

    public Refactoring() {
    }

    public void print() {
        System.out.println("Вызывалась печать");
    }

    public String getValue(){
        return "Здесь пробный текст";
    }
}
