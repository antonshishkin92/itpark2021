package lesson9.implementation;

import lesson9.starter.Account;

public class PersonalAccount extends Account {

    public PersonalAccount(String name) {
        super(name);
    }

    public static String getBic(){
        return "435677696961";
    }

    @Override
    protected void printBalance() {
        System.out.println("Текущий баланс: " + getBalance());
    }
}
