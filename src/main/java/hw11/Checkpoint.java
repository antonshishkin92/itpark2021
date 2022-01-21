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

        if (100 > speed & speed > 80) {
            System.out.println("Превышение скорости при ограничении 80 км/ч");
        } else if (height < 4 & width < 2.5 & weight < 8) {
            System.out.println();

        } else System.out.println("Превышение допустимой скорости. Вызываю полицию.Нарушитель пойман.Транспорт нарушителя: " + type + nameVehicle + numberVehicle);

    }


}

