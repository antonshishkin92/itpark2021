package hw10.impl;

import hw10.starter.Convertable;
import hw10.starter.TemperatureValue;

import static hw10.impl.CelciusToKelvinConverter.DELTA;
public class KelvinToCelciusConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue()- DELTA;
    }
}
