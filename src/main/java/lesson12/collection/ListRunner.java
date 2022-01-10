package lesson12.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {
        int[] ints={1,2,3,4,5};
        List<Integer> integers=List.of(1,2,3,4,5,6);
        List raw=List.of(1,false);
        for (Integer value: integers){
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("--------------");
        for (Iterator<Integer> iterator=integers.iterator();iterator.hasNext();) {
            Integer value = iterator.next();
            System.out.println(value + " ");
        }
        System.out.println();
        System.out.println("--------------");
        List<String> names=new ArrayList<>();
        names.add("Антон");
        names.add("Павел");
        names.add("Сергей");
        names.add("Полина");
        names.add("Любовь");
        names.add("Петр");
        System.out.println(names);
        String name="Антон";
        System.out.println("В списке имен " + name + " " + (name.contains(name) ? "найден" : "не найден"));
        names.remove("Сергей");
        System.out.println(names);
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        System.out.println("На 1м месте стоит " + names.get(names.size()-1));
        names.addAll(List.of("Марина","Глеб","Филипп"));
        System.out.println(names);
        System.out.println("В списке имен " + name + " " + (name.contains(name) ? "найден" : "не найден"));
        System.out.println(names.indexOf("Павел"));
        System.out.println(names.lastIndexOf("Павел"));
    }
}
