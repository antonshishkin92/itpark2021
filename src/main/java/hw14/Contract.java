package hw14;

import java.util.Collection;
import java.util.HashSet;

public class Contract {
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String phone;
    private Collection<Contract> LinkedContracts;

    public Contract(String name, String surname, String patronymic, String phone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phone = phone;
        this.LinkedContracts=new HashSet<>();

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public Collection<Contract> getLinkedContracts() {
        return LinkedContracts;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
