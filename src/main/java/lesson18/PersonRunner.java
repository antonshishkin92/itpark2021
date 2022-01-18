package lesson18;

import lesson18.dto.Person;
import lesson18.dto.Sex;
import lombok.SneakyThrows;

public class PersonRunner {

    @SneakyThrows
    public static void main(String[] args) {
        Person person = new Person("Shishkin Anton");
        person.setAge(33);
        Person newPerson = new Person();
        Person shishkin = new Person("Shishkin", 29, Sex.MALE, 184);

    }

}
