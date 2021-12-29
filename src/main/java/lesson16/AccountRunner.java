package lesson16;

import lesson16.concurrency.Account;
import lesson16.concurrency.AccountChangeBalanceThread;
import lesson16.concurrency.AccountDecrementThread;
import lesson16.concurrency.AccountIncrementThread;

import java.math.BigDecimal;

public class AccountRunner {
    public static void main(String[] args) throws InterruptedException{
        Account account=new Account();
        AccountIncrementThread accountIncrementThread=new AccountIncrementThread(account,new BigDecimal("20000"));
        accountIncrementThread.start();
        accountIncrementThread.join();
        AccountDecrementThread accountDecrementThread=new AccountDecrementThread(account,new BigDecimal("5000"));
        accountDecrementThread.start();
        accountDecrementThread.join();
        AccountChangeBalanceThread accountChangeBalanceThread= new AccountChangeBalanceThread(account);
        accountChangeBalanceThread.start();
    }
}
