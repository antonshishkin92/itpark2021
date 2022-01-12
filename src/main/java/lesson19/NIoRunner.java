package lesson19;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;

public class NIoRunner {

    public static void main(String[] args) throws Exception {
        Path filePath= Paths.get("D:\\test",".","test.txt");
        System.out.println("Путь до файла: "+filePath);
        System.out.println("Имя файла: " + filePath.getFileName().toFile());
        System.out.println("Путь до файла: " + filePath.normalize());
    //    Files.copy(filePath,System.out);
        System.out.println(Files.lines(filePath).collect(Collectors.joining(",")));
        Files.write(filePath.normalize(),new String("новая строка").getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND,StandardOpenOption.CREATE_NEW);
        try (BufferedReader bufferedReader= Files.newBufferedReader(filePath)){

        }
        }
}
