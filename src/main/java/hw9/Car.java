package hw9;

public class Car extends Automobile {


    public Car(String brand, String model, double fuelConsumption, double tankCapacity) {
        super(brand, model, fuelConsumption, tankCapacity, 0.0);
    }

    public void moveCar() {
        if (distanceWithoutRefueling() < 500) {
            System.out.println("Машина " + brand + model + " не сможет проехать 500 км.,без дозаправки," +
                    "потому что она проедет " + distanceWithoutRefueling() + " км.");
        } else
            System.out.println("Машина" + brand + model + " сможет проехать свыше 500 км." +
                    "Она проедет " + distanceWithoutRefueling() + " км.");
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
