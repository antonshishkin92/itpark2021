package hw4;

public class SquareRoot {
    public static void main(String[] args) {
        calcroot();
    }

    public static void calcroot() {
        double number = 34, guess = 9;
        double result, resultnew, endresult;
        result = (guess + (number / guess)) / 2; /** Эта формула называется метод Ньютона, для вычисления
         квадратного корня числа number, result - первое предположение корня числа number, guess - любое число наугад */
        resultnew = (result + (number / guess)) / 2;
        /** resultnew - новое предположение корня числа number */
        endresult = (resultnew + (number / resultnew)) / 2;
        System.out.println("Результат вычисления: " + result);
        System.out.println("Новый результат: " + resultnew);
        System.out.println("Квадратный корень: " + endresult);
        /** endresult - окончательный квадратный корень числа number */
    }
}

