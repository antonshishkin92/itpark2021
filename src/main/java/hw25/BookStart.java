package hw25;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class BookStart {

    private static final Configuration CONFIG;

    static {
        CONFIG = new Configuration();
        CONFIG.configure();
    }

    public static void main(String[] args) {

        runInsideSession(session -> {
            Author author = new Author();
            author.setId(15);
            author.setName("Пейн Б.");
            session.save(author);
            System.out.println(author);

            Book book = new Book();
            book.setIsbn("978-5-04-093540-6");
            book.setTitle("Легкий способ выучить Java");
            book.setUrl("https://market.yandex.ru/product--pein-b-legkii-sposob-vyuchit-java/674494426?text=java%20книги&cpc=VkxKw8APmC4O5R4kv23YodShBxFL4j1UuhXW4UOOqJFr-6OwJbjE9-GA2bEnedPO3kKUe1kBPIk6-n-NKrsDqHujPIIGoeQwy7NZpoiKhJ6_Q0EHJkj_gvOO1x_dxQ61edYzDv6bEN2qQrpWIo1R_7XsGpgNevrI1WLLjPeXHpzI8HPogaz2yg%2C%2C&sku=674494426&do-waremd5=XcETJUFHP4kmjPzGO4v4CA&cpa=1&nid=54510");
            book.setPageCount(400);
            book.setPrice(BigDecimal.valueOf(882));
            session.save(book);
        });

        runInsideSession(session -> {
            final Author newAuthor = session.find(Author.class,20);
            System.out.println(newAuthor.getAuthors());


            Query<Author> searchQuery = session.createQuery("from Author where name like :name", Author.class);
            searchQuery.setParameter("name", "ан%");
            searchQuery.getResultList().forEach(System.out::println);

        });
    }

    public static void runInsideSession(Consumer<Session> consumer) {
        try (final Session session = getCurrentSessionFromConfig()) {
            Transaction transaction = session.beginTransaction();
            consumer.accept(session);
            transaction.commit();
        }
    }

    public static Session getCurrentSessionFromConfig() {
        // local SessionFactory bean created
        SessionFactory sessionFactory = CONFIG.buildSessionFactory();
        return sessionFactory.getCurrentSession();
    }
}
