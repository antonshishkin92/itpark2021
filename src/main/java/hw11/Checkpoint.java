package hw11;

public class Checkpoint {

    public String type;
    public String nameVehicle;
    public String numberVehicle;
    public int speed;
    public double weight;
    public double height;
    public double width;

    public Checkpoint(String type, String nameVehicle, String numberVehicle, int speed, double weight, double height, double width) {
        this.type = type;
        this.nameVehicle = nameVehicle;
        this.numberVehicle = numberVehicle;
        this.speed = speed;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public void check() {

        if (height < 4 & width < 2.5 & weight < 8) {
            System.out.println("Всё в порядке.Можно ехать");
        } else {
            System.out.println("Проезд запрещён. Вес < 8 (т), ширина < 2.5 (м), высота < 4 (м) " + type + nameVehicle + numberVehicle);
        }
    }

    public void check2() {

        if (height < 3 & width < 2 & weight < 3.5) {
            System.out.println("Всё в порядке.Можно ехать");
        } else {
            System.out.println("Проезд запрещён. Вес < 3.5 (т), ширина < 2 (м), высота < 3 (м) " + type + nameVehicle + numberVehicle);
        }
    }

    public void check3() {

        if (height < 2.5 & width < 2 & weight < 4) {
            System.out.println("Всё в порядке.Можно ехать");
        } else {
            System.out.println("Проезд запрещён. Вес < 4 (т), ширина < 2 (м), высота < 2.5 (м) " + type + nameVehicle + numberVehicle);
        }
    }

    public void speedCheck() {
        if (speed > 80 & speed < 100) {
            System.out.println("Превышение скорости 80 км/ч. Требую снизить скорость.Водитель " + nameVehicle +
                    numberVehicle + " ваша скорость " + speed + "км/ч");
        } else if (speed > 100) {
            System.out.println("Привлекаю полицию, для задержания нарушителя " + nameVehicle + numberVehicle);
        } else if (speed < 80) {
            System.out.println(nameVehicle + " с госномером " + numberVehicle + "скорость не превысил");
        }
    }
}