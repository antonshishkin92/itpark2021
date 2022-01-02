package lesson12;

public class ExceptionRunner {

    public static void main(String[] args) {
boolean succeded = false;
        try {
            System.out.println(divide(5, 0));
            succeded=true;
        }
        catch (ArithmeticException exception){
            exception.printStackTrace();
            succeded=false;
        }
        finally {
            System.out.println(succeded ? "Выполнение операции завершено успешно" : "Выполнение операции завершено неуспешно");
        }

    }

    private static int divide(int i, int i1) {
        return i / i1;
    }
}
