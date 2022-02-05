package lesson25.spring.component.impl;

import lesson25.spring.component.Calculator;

public class CalculatorImpl implements Calculator {
    private int a;
    private int b;


    @Override
    public int summa() {
        return a + b;
    }

    @Override
    public int multiply() {
        return a * b;
    }
}
