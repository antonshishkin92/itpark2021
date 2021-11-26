package lesson8;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    String poroda;
    String bossName;

    public boolean equals(Cat cat) {
        return Objects.equals(name, cat.name) && age == cat.age
                && Objects.equals(poroda, cat.poroda);
    }
}
