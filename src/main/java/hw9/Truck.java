package hw9;

public class Truck extends Automobile {


    public Truck(String brand, String model, double fuelConsumption, double tankCapacity) {
        super(brand, model, fuelConsumption, tankCapacity, 0.0);
    }

    public void moveTruck() {
        if (distanceWithoutRefueling() < 1200) {
            System.out.println("Грузовик " + brand + model + " не сможет проехать без дозаправки 1200 км.");
        } else
            System.out.println("Грузовик" + brand + model + " сможет проехать свыше 1200 км.Он проедет " + distanceWithoutRefueling() + " км.");

    }
    public void MoveVehicle() {
        if (distanceWithoutRefueling() < 1000) {
            System.out.println("Транспортное средство " + brand + model + " не сможет проехать 1000 км.,без дозаправки," +
                    "потому что проедет " + distanceWithoutRefueling() + " км.");
        } else
            System.out.println("Транспортное средство " + brand + model + " сможет проехать свыше 1000 км." +
                    "Оно проедет " + distanceWithoutRefueling() + " км.");
    }
}
