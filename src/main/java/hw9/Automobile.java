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

/** distanceWithoutRefueling - дистанция без дозаправки(в километрах).
 * fuelConsumption - расход топлива(литр на 100 км).
 * tankCapacity - объём бака автомобиля(в литрах).
  */
    public double distanceWithoutRefueling() {
        double distanceWithoutRefueling = (100 / fuelConsumption) * tankCapacity;
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
