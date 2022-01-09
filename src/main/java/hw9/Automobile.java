package hw9;

import java.text.DecimalFormat;

public abstract class Automobile {

    public String brand;
    public String model;
    public double fuelConsumption;
    public double tankCapacity;

    public Automobile(String brand, String model, double fuelConsumption, double tankCapacity, double distanceWithoutRefueling) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }


    public double distanceWithoutRefueling() {
        double distanceWithoutRefueling = (100 / fuelConsumption) * tankCapacity;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(distanceWithoutRefueling);
        System.out.println(result);
        return distanceWithoutRefueling;
    }


    @Override
    public String toString() {
        return "Automobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", tankCapacity=" + tankCapacity +
                ", distanceWithoutRefueling=" + distanceWithoutRefueling() +
                '}';
    }
}
