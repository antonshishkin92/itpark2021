package hw10.starter;

import hw10.impl.*;

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
                    case FAHRENHEIT -> {
                        return new FahrenheitToCelciusConverter().convert(value);
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
                    case FAHRENHEIT -> {
                        return new FahrenheitToKelvinConverter().convert(value);
                    }
                }

            }
            case FAHRENHEIT -> {
                switch (value.getMeasureSystem()){
                    case CELCIUS -> {
                        return new CelciusToFahrenheitConverter().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new IdentityConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToFahrenheitConverter().convert(value);
                    }
                }
            }
        }
        throw new IllegalStateException("В данный код мы не должны попасть");
    }

    static double convert(double value, TemperatureMeasureSystem fromSystem, TemperatureMeasureSystem toSystem) {
        return Convertable.convert(new TemperatureValue(value,fromSystem),toSystem);
    }
}
