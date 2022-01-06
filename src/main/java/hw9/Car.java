package hw9;

public class Car extends Automobile{

    public double distanceWithoutRefuelingCar;

    public Car(String brand, String model, double fuelConsumption, double tankCapacity) {
        super(brand, model, fuelConsumption, tankCapacity,0.0);
    }
public void distanceWithoutRefuelingCar(){
        distanceWithoutRefuelingCar = (100/fuelConsumption)*tankCapacity;
}




}
