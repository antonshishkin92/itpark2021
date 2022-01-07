package hw9;

public abstract class Automobile {

    public String brand;
    public String model;
    public double fuelConsumption;
    public double tankCapacity;

    public Automobile(String brand, String model, double fuelConsumption, double tankCapacity,double distanceWithoutRefueling) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
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

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
    public double getDistanceWithoutRefueling(){
        double distanceWithoutRefueling =(100/fuelConsumption)*tankCapacity;
        return distanceWithoutRefueling;
    }



    @Override
    public String toString() {
        return "Automobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", tankCapacity=" + tankCapacity +
                ", distanceWithoutRefueling=" + getDistanceWithoutRefueling() +
                '}';
    }
}
