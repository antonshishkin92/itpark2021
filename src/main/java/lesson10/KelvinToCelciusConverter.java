package lesson10;

import static lesson10.CelciusToKelvinConverter.DELTA;
public class KelvinToCelciusConverter implements Convertable{

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue()- DELTA;
    }
}
