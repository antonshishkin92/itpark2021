package lesson9.implementation;

import lesson9.Account;
import lesson9.Course;
import static lesson9.Course.Current_value;

public class CompanyAccount extends Account {

   public static int count = 0;
   // public static double course = 75.56; // 1$= 75.56 рублей


    public CompanyAccount(String name) {
        super(name);
        count++;
    }

    public double getBalanceInDollars(){
        if(isBlocked()){
            return 0;
        }
return getBalance()/ Current_value;
    }

    @Override
    protected void printBalance() {
        System.out.println("Текущий баланс в долларах: " + getBalanceInDollars());
    }
}
