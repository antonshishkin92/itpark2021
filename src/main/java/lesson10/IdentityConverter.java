package lesson10;

public class IdentityConverter implements Convertable{

    @Override
    public double convert(TemperatureValue value) {
        return value.getValue();
    }
}
