package hw10.impl;

import hw10.starter.Convertable;
import hw10.starter.TemperatureValue;

import static hw10.impl.FahrenheitToCelciusConverter.Koefficient;
import static hw10.impl.FahrenheitToCelciusConverter.Delta;

public class CelciusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(TemperatureValue value) {
        return value.getValue() * Koefficient + Delta;
    }
}
