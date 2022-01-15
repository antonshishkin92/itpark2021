package hw9;

public class Car extends Automobile {


    public Car(String brand, String model, double fuelConsumption, double tankCapacity) {
        super(brand, model, fuelConsumption, tankCapacity, 0.0);
    }

    public void moveCar() {
        if (distanceWithoutRefueling() < 500) {
            System.out.println("Машина " + brand + model + " не сможет проехать без дозаправки 500 км.");
        } else
            System.out.println("Машина" + brand + model + " сможет проехать свыше 500 км.Она проедет " + distanceWithoutRefueling() + " км.");
    }

}
