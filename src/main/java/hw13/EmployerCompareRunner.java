package hw13;


import java.util.*;

public class EmployerCompareRunner {

    public static void main(String[] args) {
        Set<Employer> employers = new LinkedHashSet<>();
        employers.add(new Employer(1, "Васильев Анатолий Сергеевич", 15));
        employers.add(new Employer(119, "Петров Федор Андреевич", 7));
        employers.add(new Employer(98, "Боширов Валентин Антонович", 23));
        employers.add(new Employer(84, "Пупкин Вадим Борисович", 19));
        employers.add(new Employer(204, "Фролина Снежанна Денисовна ", 27));
        employers.add(new Employer(6, "Березина Мария Степановна", 5));
        employers.add(new Employer(237, "Мякишева Анна Сергеевна", 12));
        System.out.println(employers);


    }
}
