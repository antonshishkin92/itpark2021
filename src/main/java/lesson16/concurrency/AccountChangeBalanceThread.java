package lesson16.concurrency;

import java.math.BigDecimal;

public class AccountChangeBalanceThread extends Thread {
    private final Account account;

    public AccountChangeBalanceThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            account.deposit(new BigDecimal(4000));
            Thread.sleep(1000);
            account.deposit(new BigDecimal(9000));
            System.out.println("Текущее состояние счёта: " + account.getBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
