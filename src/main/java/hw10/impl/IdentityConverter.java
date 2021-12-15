package hw10.impl;

import hw10.starter.Convertable;
import hw10.starter.TemperatureValue;

public class IdentityConverter implements Convertable {

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue();
    }
}
