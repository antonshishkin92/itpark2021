package hw10.impl;

import hw10.starter.Convertable;
import hw10.starter.TemperatureValue;

public class KelvinToFahrenheitConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue()- CelciusToKelvinConverter.DELTA)* FahrenheitToCelciusConverter.Koefficient+FahrenheitToCelciusConverter.Delta;
    }
}
