package lesson6;

import java.util.Scanner;

public class ArrayFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько чисел Фибоначчи вы хотите увидеть на консоле?");
        int n = scanner.nextInt();
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];

        }

        for (int i = 0; i < n; i++) {
            System.out.println("Число Фибоначчи " + f[i]);
        }
    }
}
