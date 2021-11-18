package lesson5;

import java.util.Scanner;

public class getFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n-ую последовательность: ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Число Фибоначчи: " + b);

    }
}
