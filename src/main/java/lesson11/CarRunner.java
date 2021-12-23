package lesson11;

public class CarRunner {
    public static void main(String[] args) throws Exception{
        Car car = new Car();
        car.setDistance(100_000);
        car.setMark("Skoda");
        car.setModel("Octavia");
        car.setEngine(car.new Engine(1.4));
//      car.setEngine(new car Engine(1.4));

        car.new Engine(1.6);
//      new.car Engine(1.6);

        try {
            Object carClone=car.clone();
            System.out.println(car);
            System.out.println(carClone);
        }catch (CloneNotSupportedException e){
            System.out.println("Клонирование для объекта класса car не поддерживается");
        }

    }

}
