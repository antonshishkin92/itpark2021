package lesson2;

public class SecondProgram {

    public static void main(String[] args) {
        System.out.println("Привет, мир всем!");

        long summa = calculate(3, 5);
        System.out.println(summa);
        long otherSumma = calculate(5, 5);
        System.out.println(otherSumma);
        long yetAnotherSumma = calculate(2, 18);
        System.out.println(yetAnotherSumma);

        long resultOfMinus = minus(4, 17);
        System.out.println(resultOfMinus);

        long result = multiplyAndSumma(8);
        System.out.println(result);}

    /**
     * Метод будет складывать да аргумента и возвращать результат этой операции
     *
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     */

    public static long calculate(int arg1, int arg2) {
      /* В этой переменной будет храниться результат сложения двух чисел
      Результат вычисления должен быть совместим по типу с аргументами,
      над которыми осуществляется операция сложения
      Еще одна строка */
        int result = arg1 + arg2;
        return result;}

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long multiplyAndSumma(int arg1) {
        int result = 9 * arg1 + 20;
        result = result - 50;
        return result;}
}
