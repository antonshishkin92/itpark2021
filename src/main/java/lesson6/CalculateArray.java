package lesson6;

import java.util.Scanner;

public class CalculateArray {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите длину массива: ");
        int a = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }


        double max = array[0];
        double min = array[0];
        double avg = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (max > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avg);
    }
}

