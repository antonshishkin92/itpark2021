package lesson9;


abstract class Automobile {
    String brand;
    String model;
    int distance;

    public Automobile(String brand, String model, int distance) {

        this.brand = brand;
        this.model = model;
        this.distance = distance;
    }


    public void move() {
        this.distance = distance;
    }
}

