package hw3;

import java.util.Scanner;

public class Kvadratnoeuravnenie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, d;
        double x1, x2;
        System.out.println("Введите значение a: ");
        a = in.nextDouble();
        System.out.println("Введите значение b: ");
        b = in.nextDouble();
        System.out.println("Введите значение c: ");
        c = in.nextDouble();
        d = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Дискриминант: " + d);
        if (a == 0) {
            System.out.println("Значение а не может быть 0");
        } else if (d > 0) {
            x1 = ((-b) + Math.sqrt(d)) / 2 * a;
            x2 = ((-b) - Math.sqrt(d)) / 2 * a;
            System.out.println("Значение x1 = " + x1 + " Значение x2 = " + x2);
        } else if (d == 0) {
            x1 = (-1) * b / 2 * a;
            System.out.println("Значение x1, x2 = " + x1);
        } else {
            System.out.println("Нет действительных решений уравнения, потому что d < 0");}
    }
}