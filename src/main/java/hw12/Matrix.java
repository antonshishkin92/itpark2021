package hw12;

import hw12.exception.MyArrayDataException;
import hw12.exception.MyArrayNullElementException;
import hw12.exception.MyArraySizeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;


public class Matrix {

    public static final int Rows=4;
    public static final int Columns =4;

    private static final List<String> Symbols = List.of("25", "45", "16", "53", "-10", "34",
                                                        "0", "3", "4", "15", "29", "57", "-30",
                                                        "22", "1", "31");


    private List<List<String>> values;

    public Matrix(int n, int m) {
        if (n != Rows || m != Columns) {
            throw new MyArraySizeException(n,m,"Произошла ошибка во время инициализации матрицы");
        }
        this.values = new ArrayList<>(n);
        fillUp(n, m);
    }


    public void fillUp(int n, int m) {
        for (int i = 0; i < n; i++) {
            List<String> lines = new ArrayList<>(m);
            this.values.add(lines);
            for (int j = 0; j < m; j++) {
                int randomIndex = new Random().nextInt(Symbols.size());
                if (randomIndex < 0) {
                    randomIndex = 0;
                }
                lines.add(Symbols.get(randomIndex));
            }
        }

    }

    public int sum() throws MyArrayDataException {
        int result =0;
        for (int i = 0; i < this.values.size();i++){
            List<String> row=this.values.get(i);
            for (int j = 0; j < row.size(); j++){
                String value = row.get(j);
                if (Objects.isNull(value)||value.isEmpty()){
                    throw new MyArrayNullElementException("Недопустимы null- значения или пустые строки");
                }
               if (!value.matches("^(-*(\\d)+)$")){
                   throw new MyArrayDataException(i+1,j+1, "некорректное значение в качестве элементы матрицы");
               }
                result += Integer.parseInt(value);



            }
        }
        return result;

    }

    public void print() {
        for (List<String> lines : this.values) {
            System.out.println(lines);
        }
    }
}
