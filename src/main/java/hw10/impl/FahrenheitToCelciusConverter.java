package hw10.impl;

import hw10.starter.Convertable;
import hw10.starter.TemperatureValue;

public class FahrenheitToCelciusConverter implements Convertable {

    public static final int Delta = 32;
    public static final double Koefficient = 1.8;

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue()- Delta)/ Koefficient;
    }
}
