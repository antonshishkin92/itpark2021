package hw12;

import hw12.exception.MyArrayDataException;

public class MatrixRunner {

    public static void main(String[] args) throws MyArrayDataException {
        Matrix matrix = new Matrix(4,4);
        matrix.print();
        System.out.println("Результат суммирования элементов матрицы равна: " + matrix.sum());
    }
}
