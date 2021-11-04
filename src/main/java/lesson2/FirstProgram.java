package lesson2;

public class FirstProgram {

    public static void main(String[] args) {
        System.out.println("Привет, мир всем!");

        long summa = calculate(3,5);
        System.out.println(summa);
        long otherSumma = calculate(5,5);
        System.out.println(otherSumma);
        long yetAnotherSumma = calculate(2,18);
        System.out.println(yetAnotherSumma);

        long resultOfMinus = minus(2,18);
        System.out.println(resultOfMinus);
    }

    /**
     * Метод будет складывать да аргумента и возвращать результат этой операции
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     */
    public static long calculate(int arg1, int arg2) {
      /* В этой переменной будет храниться результат сложения двух чисел
      Результат вычисления должен быть совместим по типу с аргументами,
      над которыми осуществляется операция сложения
      Еще одна строка */
        int result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }
}
