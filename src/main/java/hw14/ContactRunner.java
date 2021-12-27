package hw14;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ContactRunner {

    private static final Integer LIMIT = 10_000;
    private static final Integer LIMIT_OF_LINKED_CONTACTS = 100;

    public static void main(String[] args) {
        Long now =System.currentTimeMillis();
        Contact[] contacts = fillContactArrays();
        long spentTime=System.currentTimeMillis()-now;
//        long seconds = TimeUnit.SECONDS.convert(System.currentTimeMillis()-now,TimeUnit.MILLISECONDS);
        System.out.printf("Заполнение массива из %d элементов потребовало %.2f секунд\n",contacts.length, spentTime / 1000d);
        System.out.println(Arrays.toString(contacts));
    }

    private static Contact[] fillContactArrays() {
        Contact[] contacts = new Contact[LIMIT];
        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new Contact();
        }
        return contacts;
    }


}
