import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Item item1 = new Item(2);
        Item item2 = new Item(4);
        Item item3 = new Item(5);
        Item item4 = new Item(12);
        Item item5 = new Item(8);
        Item item6 = new Item(10);
        Item item7 = new Item(32);
        Item item8 = new Item(1);

        Set<Item> items1 = new HashSet<Item>();
        Set<Item> items2 = new HashSet<Item>();
        Set<Item> items3 = new HashSet<Item>();
        Set<Item> items4 = new HashSet<Item>();

        items1.add(item1);
        items1.add(item2);
        items1.add(item3);
        items1.add(item4);

        items2.add(item5);
        items2.add(item6);
        items2.add(item7);
        items2.add(item8);

        items3.add(item1);
        items3.add(item3);
        items3.add(item5);
        items3.add(item7);

        items4.add(item2);
        items4.add(item4);
        items4.add(item6);
        items4.add(item8);

        Cart cart1 = new Cart("Cart1", items1);
        Cart cart2 = new Cart("Cart2", items2);
        Cart cart3 = new Cart("Cart3", items3);
        Cart cart4 = new Cart("Cart4", items4);

        session.persist(cart1);
        session.persist(cart2);
        session.persist(cart3);
        session.persist(cart4);

        transaction.commit();
        session.close();
    }
}
