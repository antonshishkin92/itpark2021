package hw9;

import java.util.Arrays;

public class vehicleRunner {
    public static void main(String[] args) {
        Car hyundaiAccent = new Car("Hyundai", "Accent", 9.9, 45);
        Car daewooMatiz = new Car("Daewoo", "Matiz", 13.1, 35);
        Car chevroletAveo = new Car("Chevrolet", "Aveo", 14.5, 46);
        Car opelCorsa = new Car(" Opel", "Corsa", 7.7, 45);
        Car kiaRio = new Car(" Kia", "Rio", 8.6, 43);
        Car nissanJuke = new Car(" Nissan", "Juke", 7.3, 45);
        Car skodaFabia = new Car("Skoda", "Fabia", 12.4, 50);
        Car fordKuga = new Car(" Ford", "Kuga", 11.4, 60);
        Car fiatDucato = new Car(" Fiat", "Ducato", 12.6, 80);
        Car chevroletNiva = new Car("Chevrolet", "Niva", 17.7, 60);
        Car kiaCeed = new Car(" Kia", "Ceed", 9.8, 55);
        Car toyotaCorolla = new Car("Toyota", "Corolla", 12.4, 50);
        Car toyotaCamry = new Car(" Toyota", "Camry", 10.1, 70);
        Truck sadkoNext = new Truck("Садко", "Некст", 21.5, 90);
        Truck manTGL = new Truck(" Man", "TGL", 19.4, 240);
        Truck manTGA = new Truck("Man", "TGA", 25, 260);
        Truck volksagenCrafter = new Truck("Volkswagen", "Crafter", 16.7, 95);
        Truck ivecoEurocargo = new Truck(" Iveco", "Eurocargo", 17.4, 245);
        Truck ivecoDaily = new Truck("Iveco", "Daily", 14.9, 95);
        Truck fordCargo = new Truck("Ford", "Cargo", 16.6, 190);
        Truck volvoFL = new Truck(" Volvo", "FL", 18.1, 285);
        Truck volvoFH = new Truck(" Volvo", "FH", 14.4, 230);
        Truck isuzuELF = new Truck("Isuzu", "ELF", 17.5, 150);
        Truck isuzuForward = new Truck("Isuzu", "Forward", 24.1, 140);
        Truck uazCargo = new Truck("УАЗ", "Карго", 14, 90);

        Car[] arrayCars = new Car[]{hyundaiAccent, daewooMatiz, chevroletAveo, opelCorsa, kiaRio, kiaCeed, nissanJuke,
                skodaFabia, fordKuga, chevroletNiva, kiaCeed, fiatDucato, toyotaCamry, toyotaCorolla};
        System.out.println(Arrays.toString(arrayCars));

        Truck[] arrayTrucks = new Truck[]{sadkoNext, manTGA, manTGL, volksagenCrafter, ivecoEurocargo, ivecoDaily, fordCargo,
                volvoFL, volvoFH, isuzuELF, isuzuForward, uazCargo};
        System.out.println(Arrays.toString(arrayTrucks));

        hyundaiAccent.moveCar();
        daewooMatiz.moveCar();
        chevroletAveo.moveCar();
        opelCorsa.moveCar();
        kiaRio.moveCar();
        kiaCeed.moveCar();
        nissanJuke.moveCar();
        skodaFabia.moveCar();
        fordKuga.moveCar();
        chevroletNiva.moveCar();
        kiaCeed.moveCar();
        fiatDucato.moveCar();
        toyotaCamry.moveCar();
        toyotaCorolla.moveCar();
        System.out.println("------------");
        sadkoNext.moveTruck();
        manTGA.moveTruck();
        manTGL.moveTruck();
        volksagenCrafter.moveTruck();
        ivecoEurocargo.moveTruck();
        ivecoDaily.moveTruck();
        fordCargo.moveTruck();
        volvoFL.moveTruck();
        volvoFH.moveTruck();
        isuzuELF.moveTruck();
        isuzuForward.moveTruck();
        uazCargo.moveTruck();
        System.out.println("----------------------");
    }
}
