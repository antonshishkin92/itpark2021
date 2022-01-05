package hw9;

public class Automobile {

    public String brand;
    public String model;


    public Automobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double distance(double fuelConsumption, double tankCapacity){
        double distanceWithoutRefueling = (100/fuelConsumption) * tankCapacity;
return distanceWithoutRefueling;
    }

}
