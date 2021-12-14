package lesson10;

public class UniversalConverter {
    public static double convert(double value, TemperatureMeasureSystem fromSystem, TemperatureMeasureSystem toSystem) {
        switch (toSystem) {
            case CELCIUS -> {
                switch (fromSystem) {
                    case KELVIN -> {
                        return new KelvinToCelciusConverter().convert(new TemperatureValue(value, fromSystem));
                    }
                }
            }
            case KELVIN -> {
                switch (fromSystem) {
                    case CELCIUS -> {
                        new CelciusToKelvinConverter().convert(new TemperatureValue(value, fromSystem));
                    }
                }
            }
        }
        throw new UnsupportedOperationException("Другие типы конвертирования пока не реализованы");
    }
}