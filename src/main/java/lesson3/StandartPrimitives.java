package lesson3;

public class StandartPrimitives {
    public static void main(String[] args) {
        byte argument = 123;
        byte errorDigit = (byte) 130;
        byte digit = (byte) (28 + 130);
        System.out.println(errorDigit);

        short anotherOrigit = 768;
        int arg = Integer.MAX_VALUE;
        System.out.println(arg);
        long bigValue = 14564165L;

        char symbol = 'Я';
        System.out.println(symbol + 1);

        double digitWithPoint = 3.14; // 64 битный
        float floatvalue = 100.25F; // 32 битный

        boolean flag = true; // истина
        boolean lie = false; // ложь
        boolean value = 100 != 1_000_000;
        boolean notValue = !value;
        boolean trueValue = true != false; // не рекомендуется использовать
        boolean complexAnd = (100 == 100) && (125 == 125); // true = true & true
        boolean complexOr = (100 == 100) || (125 == 125); // true = true | true

        if (value) {
            System.out.println("Переменная value истинна");
        } else {
            System.out.println("Переменная value ложна");
        }

        double floatingPointValue = 1.5;
        if (2.5 == floatingPointValue) {
            System.out.println("2.5 равно " + floatingPointValue);
        } else if (1==1){
            System.out.println("2.5 не равна " + floatingPointValue + ", но 1 = 1");
        } else {
            System.out.println("2.5 не равна " + floatingPointValue);
        }

        boolean bool1 = floatingPointValue != 0 && (100/floatingPointValue == 10);

        if (bool1 != true){} // так делать не нужно, лучше пользоваться !
        else {}
    }
}
