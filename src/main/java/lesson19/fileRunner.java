package lesson19;

import lesson19.util.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

public class fileRunner {

    public static void main(String[] args) {
        String filelocation = "D:\\test\\test.txt";
        File file=new File(filelocation);
        String fileName=file.getName();
        System.out.println("имя файла " + file.getName());
        System.out.println("Расширение файла: " + FileUtils.getFileExtension(fileName));
        System.out.println("Расширение файла: " + FilenameUtils.getExtension(fileName));
        System.out.println( "Родительская папка файла " + file.getParent());
        System.out.println( "Существует файл? " + (file.exists() ? "Да" : "нет"));
        System.out.println(file.isFile() ? "Да" : "нет");
        System.out.println( "Создались промежуточные папки? " + (file.mkdirs() ? "Да" : "нет"));



    }
}
