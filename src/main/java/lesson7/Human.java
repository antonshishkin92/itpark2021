package lesson7;

public class Human {
    String name;
    String surname;
    int age;
    double weight;
    double height;
    Boolean hasQrcode;

    public Human(){

    }

    public Human(String name, String surname, int age, double weight, double height, Boolean hasQrcode) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hasQrcode = hasQrcode;
    }

    public void beOlder(){
age++;
    }
    public void vaccinated(){
        this.hasQrcode=true;
    }
}
