package lesson18;

import lesson18.dto.Person;
import lesson18.dto.Sex;
import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SerializationRunner {

    @SneakyThrows
    public static void main(String[] args) {
        Person shishkinAnton = new Person("Shishkin Anton", 29, Sex.MALE, 184);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\test\\person.dat"))) {
            oos.writeObject(shishkinAnton);
        }
    }
}
