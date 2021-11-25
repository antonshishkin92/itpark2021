package lesson7;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Тоша";
        cat.age = 8;
        cat.weight = 4.5;
        cat.running = 130;
        cat.swimming = 0;

        Animal dog = new Animal();
        dog.name = "Рекс";
        dog.age = 3;
        dog.weight = 6.2;
        dog.running = 480;
        dog.swimming = 9;


        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            if (Integer.valueOf(480).equals(animal.running))
                System.out.println("Собака по имени " + animal.name + " пробежала " + animal.running + " метров");
            else if (Integer.valueOf(0).equals(animal.swimming)) {
                System.out.println(animal.name + " не умеет плавать");
            }
        }

    }
}
