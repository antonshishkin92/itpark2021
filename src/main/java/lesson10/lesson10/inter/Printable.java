package lesson10.lesson10.inter;

import lesson10.enumeration.Language;

public interface Printable {
    int INDEX = 1;

    void print();


    static void print(String str) {
        System.out.println(str);
    }

    default void print(int index) {
        print("");
    }

    default void printHelloWorld(Language language){
        switch (language){
            case Russian -> System.out.println("Привет, мир");
            case French -> System.out.println("Salut le monde");
            case English -> System.out.println("Hello world");
            case German -> System.out.println("Hallo Welt");
        }
    }
}
