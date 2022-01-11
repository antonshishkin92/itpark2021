package lesson13;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
        System.out.println(Set.of(13, 15, -1, 28, 75));
        Set<Product> products = new LinkedHashSet<>();
        products.add(new Product(1, "Хлеб", 35));
        products.add(new Product(10, "Хлеб", 35));
        products.add(new Product(2, "Молоко", 54));
        products.add(new Product(3, "Яблоки", 100));
        products.add(new Product(4, "Зубная паста", 300));
        products.add(new Product(5, "Мусорные пакеты", 40));
        System.out.println(products);

        Set<Integer> values = new TreeSet<>();
        values.add(150);
        values.add(1);
        values.add(142);
        values.add(-8);
        values.add(19);
        values.add(1);
        System.out.println(values);

        Set<Product> products2 = new TreeSet<>(/*new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId().compareTo(o2.getId());
            }
        }*/);
        products2.add(new Product(145, "Хлеб", 35));
        products2.add(new Product(10, "Хлеб", 35));
        products2.add(new Product(22, "Молоко", 54));
        products2.add(new Product(3, "Яблоки", 100));
        products2.add(new Product(48, "Зубная паста", 300));
        products2.add(new Product(-5, "Мусорные пакеты", 40));
        System.out.println(products2);
    }



}
