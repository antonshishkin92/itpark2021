package hw14;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ContactRunner {

    private static final Integer LIMIT = 100_000;
    private static final Integer LIMIT_OF_LINKED_CONTACTS = 100;

    public static void main(String[] args) {
//        long seconds = TimeUnit.SECONDS.convert(System.currentTimeMillis()-now,TimeUnit.MILLISECONDS);
       Contact[] contacts = generateElementsInArrayAndMeasureTime(ContactRunner::fillContactArrays);
        Collection<Contact> contactList = generateElementsAndMeasureTime(ContactRunner::fillContactList);
        Collection<Contact> contactSet = generateElementsAndMeasureTime(ContactRunner::fillContactSet);

    }

    public static Contact[] generateElementsInArrayAndMeasureTime(Supplier<Contact[]> supplier){
        Long now =System.currentTimeMillis();
        Contact[] collection=supplier.get();
        long spentTime=System.currentTimeMillis()-now;
        System.out.printf("Заполнение массива из %d элементов потребовало %.2f секунд\n",collection.length, spentTime / 1000d);
        return collection;
    }


    public static Collection<Contact> generateElementsAndMeasureTime(Supplier<Collection<Contact>> supplier){
        Long now =System.currentTimeMillis();
        Collection<Contact> collection=supplier.get();
        long spentTime=System.currentTimeMillis()-now;
        System.out.printf("Заполнение %s из %d элементов потребовало %.2f секунд\n",
                collection instanceof List ? "списка" : "множества",
                collection.size(), spentTime / 1000d);
        return collection;
    }

    private static Contact[] fillContactArrays() {
        Contact[] contacts = new Contact[LIMIT];
        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new Contact();
        }
        return contacts;
    }

    private static List<Contact> fillContactList() {
        List<Contact> contacts = new ArrayList<>(LIMIT);
        IntStream.range(0, LIMIT).forEach(value -> contacts.add(new Contact()));

        return contacts;
    }

    private static Set<Contact> fillContactSet() {
        Set<Contact> contacts = new HashSet<>(LIMIT);
        IntStream.range(0, LIMIT).forEach(value -> contacts.add(new Contact()));

        return contacts;
    }
}
