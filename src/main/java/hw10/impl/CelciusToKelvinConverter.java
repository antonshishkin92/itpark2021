package hw10.impl;

import hw10.starter.Convertable;
import hw10.starter.TemperatureValue;

public class CelciusToKelvinConverter implements Convertable {

   public static final double DELTA =273.15;

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue()+DELTA;
    }
}
