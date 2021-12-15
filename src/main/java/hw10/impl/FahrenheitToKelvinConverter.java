package hw10.impl;

import hw10.starter.Convertable;
import hw10.starter.TemperatureValue;

public class FahrenheitToKelvinConverter implements Convertable {
    @Override
    public double convert(TemperatureValue value) {
        return (value.getValue()- FahrenheitToCelciusConverter.Delta)/FahrenheitToCelciusConverter.Koefficient+ CelciusToKelvinConverter.DELTA;
    }
}
