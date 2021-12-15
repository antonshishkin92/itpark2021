package hw10.starter;

import hw10.starter.TemperatureMeasureSystem;

public class TemperatureValue {
    private final double value;
    private final TemperatureMeasureSystem measureSystem;

    public TemperatureValue(double value, TemperatureMeasureSystem measureSystem) {
        this.value = value;
        this.measureSystem = measureSystem;
    }

    public double getValue() {
        return value;
    }

    public TemperatureMeasureSystem getMeasureSystem() {
        return measureSystem;
    }
}
