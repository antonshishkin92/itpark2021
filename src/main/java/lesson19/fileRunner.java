package lesson19;

import java.io.File;

public class fileRunner {

    public static void main(String[] args) {
        String filelocation = "D:\\test\\test.txt";
        File file=new File(filelocation);
        System.out.println("имя файла " + file.getName());
        System.out.println( "Родительская папка файла " + file.getParent());
        System.out.println( "Существует файл? " + (file.exists() ? "Да" : "нет"));
        System.out.println( "Создались промежуточные папки? " + (file.mkdirs() ? "Да" : "нет"));



    }
}
