package lesson10;

public enum TemperatureMeasureSystem {
    CELCIUS("C"),KELVIN("K"), FAHRENHEIT("F");
    private final String shortName;

    TemperatureMeasureSystem(String shortName) {
        this.shortName = shortName;
    }

    public static TemperatureMeasureSystem of(String input){
        for (TemperatureMeasureSystem measureSystem: values()){
            if (measureSystem.shortName.equalsIgnoreCase(input)){
                return measureSystem;
            }
        }
    return CELCIUS;
    }
}
