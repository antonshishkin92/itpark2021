package hw3;

public class PoluchenieFaktoriala {
    public static void main(String[] args) {
        // n!//
        System.out.println(Factorial(6));}

    private static int Factorial(int n) {
        if (n == 1) {return 1;}
        else {return n * Factorial(n - 1);}
    }
}
