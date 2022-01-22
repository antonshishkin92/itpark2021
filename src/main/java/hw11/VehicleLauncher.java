package hw11;

public class VehicleLauncher {
    public static void main(String[] args) {
        Car hyundaiAccent = new Car("легковая ", "Hyundai Accent", " D732BN", 83, 2.5, 1.9, 1.5);
        Car hyundaiSolaris = new Car("легковая ", "Hyundai Solaris", " S609RY", 102, 1.6, 1.5, 1.7);
        Car daewooMatiz = new Car("легковая ", "Daewoo Matiz", " X2018CZ", 65, 1.4, 1.7, 1.4);
        Car chevroletAveo = new Car("легковая ", "Chevrolet Aveo", " Q8345eP", 120, 2.6, 1.8, 1.9);
        Car opelCorsa = new Car("легковая ", "Opel Corsa", " A5538NZC", 112, 2.3, 2.2, 2.2);
        Car kiaRio = new Car("легковая ", " Kia Rio", " F747LK", 89, 3.4, 1.5, 2.1);
        Car nissanJuke = new Car("легковая ", "Nissan Juke", " K91823QN", 104, 2.6, 1.9, 1.8);
        Car skodaFabia = new Car("легковая ", "Skoda Fabia", " HY2640JD", 75, 3.1, 2.6, 2.7);
        Car toyotaCorolla = new Car("легковая ", "Toyota Corolla", " ZF126Pi", 78, 2.7, 1.8, 1.9);
        Car chevroletNiva = new Car("легковая ", "Chevrolet Niva", " GD8549yU", 72, 2.8, 2.2, 2.7);
        Truck vwCrafter = new Truck("грузовая ", "Volkswagen Crafter", " MU4108IH", 97, 5.1, 3.2, 2.6);
        Truck sadkoNext = new Truck("грузовая ", "Sadko Next", " VC56473OE", 120, 4.5, 4.4, 2.5);
        Truck manTGL = new Truck("грузовая ", "Man TGL", " FE42175mJ", 76, 8.5, 3.7, 2.3);
        Truck manTGA = new Truck("грузовая ", "Man TGA", " NV890HG", 130, 6.6, 3.0, 2.9);
        Truck crafter = new Truck("грузовая ", "Volkswagen Crafter", " MU4108IH", 97, 5.1, 3.2, 2.6);
        Truck ivecoEuro = new Truck("грузовая ", "Iveco Eurocargo", " UT650JS", 88, 4.3, 2.9, 3.3);
        Truck ivecoDaily = new Truck("грузовая ", "Iveco Daily", " RW865dfGu", 85, 3.8, 3.5, 2.4);
        Truck fordCargo = new Truck("грузовая ", "Ford Cargo", " BC705dT", 79, 3.0, 3.3, 2.25);
        Truck volvoFH = new Truck("грузовая ", "Volvo FH", " Uv861fj", 70, 5.7, 4.7, 2.9);
        Truck volvoFL = new Truck("грузовая ", "Volvo FL", " paF5438Jh", 104, 5.0, 3.8, 2.47);
        Truck uaz = new Truck("грузовая ", "UAZ Cargo", " Kj440msD", 80, 3.4, 3.1, 2.38);

hyundaiAccent.check();
hyundaiAccent.check2();
hyundaiAccent.check3();
hyundaiAccent.speedCheck();
hyundaiSolaris.speedCheck();
hyundaiSolaris.check();
hyundaiSolaris.check2();
hyundaiSolaris.check3();
opelCorsa.speedCheck();
opelCorsa.check();
opelCorsa.check2();
opelCorsa.check3();
kiaRio.check();
kiaRio.check2();
kiaRio.check2();
kiaRio.speedCheck();
skodaFabia.check();
skodaFabia.check2();
skodaFabia.check3();
skodaFabia.speedCheck();
uaz.speedCheck();
uaz.check();
uaz.check2();
uaz.check3();
volvoFH.speedCheck();
volvoFH.check2();
volvoFH.check3();
manTGA.speedCheck();
manTGA.check();
manTGA.check2();
manTGA.check3();
fordCargo.speedCheck();
fordCargo.check();
fordCargo.check2();
fordCargo.check3();



    }

}
