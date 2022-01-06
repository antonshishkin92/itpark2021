package hw9;

public class Truck extends Automobile {

    private double distanceWithoutRefuelingTruck;

    public Truck(String brand, String model, double fuelConsumption, double tankCapacity) {
        super(brand, model, fuelConsumption, tankCapacity, 0.0);
    }

    public void distanceWithoutRefuelingTruck() {
        distanceWithoutRefuelingTruck = (100 / fuelConsumption) * tankCapacity;

    }


}
