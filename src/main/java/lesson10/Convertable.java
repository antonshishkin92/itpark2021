package lesson10;

public interface Convertable {
    double convert(TemperatureValue value);

    static double convert(TemperatureValue value, TemperatureMeasureSystem toSystem) {
        switch (toSystem) {
            case CELCIUS -> {
                switch (value.getMeasureSystem()) {
                    case CELCIUS -> {
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToCelciusConverter().convert(value);
                    }
                }

            }

            case KELVIN -> {
                switch (value.getMeasureSystem()) {
                    case KELVIN -> {
                        return new IdentityConverter().convert(value);
                    }
                    case CELCIUS -> {
                        return new CelciusToKelvinConverter().convert(value);
                    }
                }

            }
        }
        return -1;
    }

    static double convert(double value, TemperatureMeasureSystem fromSystem, TemperatureMeasureSystem toSystem) {
        return Convertable.convert(new TemperatureValue(value,fromSystem),toSystem);
    }
}
