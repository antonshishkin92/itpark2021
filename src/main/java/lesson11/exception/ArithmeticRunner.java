package lesson11.exception;

import java.util.Scanner;

public class ArithmeticRunner {
    public static void main(String[] args) {
        System.out.println("Введите два числа, которые будут поделены друг на друга: ");
        Scanner scanner = new Scanner(System.in);
       int num1;
        try {
            System.out.println("Введите сперва первое: ");
            num1=scanner.nextInt();
       }catch (Throwable e){
           num1=11;
           scanner.next();
       }
int num2;
        try {
            System.out.println("Введите и второе: ");
             num2=scanner.nextInt();
        }catch (Throwable e){
            num2=11;
        }

        int result;
        try {
            result =divide(num1,num2);
            System.out.println("Результат деления: " +result);
        }catch (Throwable exception){
            System.out.println("Во время деления произошла ошибка ");
        }


    }


    public static int divide(int a, int b){
        return a/b;
    }
}

