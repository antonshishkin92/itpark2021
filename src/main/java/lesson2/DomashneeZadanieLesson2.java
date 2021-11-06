package lesson2;

public class DomashneeZadanieLesson2 {
    public static void main(String[] args) {

        long resultDel = del(15,5);
        System.out.println(resultDel);

        long summa = calculate(20,9);
        System.out.println(summa);

        long resultOfMinus = minus(22,26);
        System.out.println(resultOfMinus);

        long resultStreugolnik =Streugolnik(6,7);
        System.out.println(resultStreugolnik);
    }

    public static long del(int arg1, int arg2) {
        /* Здесь выполняется операция деление */
        return arg1 / arg2;
    }

    public static long calculate(int arg1, int arg2) {
      /* Эта операия сложение двух чисел, результат вычисления должен быть совместим по типу с аргументами,
      над которыми осуществляется операция сложения */
        int result = arg1 + arg2;
        return result;}

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long Streugolnik(int arg1, int arg2) {
        /* Эта команда позволяет найти площадь треугольника по формуле S= b*h/2, делённая пополам,
        где S - это resultStreugolnik - площадь треугольника, arg1 - основание стороны b, arg2 - её высота h */
        int resultStreugolnik =arg1*arg2/2;
        return resultStreugolnik;}
}
