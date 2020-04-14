import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

import many_to_many.Cart;
import many_to_many.Item;
import many_to_one.Costumer;
import many_to_one.Purchase;
import one_to_one.Human;
import one_to_one.Life;
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

        //one-to-one
//        oneToOneExample(sessionFactory);

        //many-to-one
        manyToOneExample(sessionFactory);

        //many-to-many
//        manyToManyExample(sessionFactory);
    }

    private static void manyToOneExample(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Costumer costumer = new Costumer("Cos", "Tumer", "Costumer@gmail.com");

        Purchase purchase1 = new Purchase("SomeProduct", 10, costumer);
        Purchase purchase2 = new Purchase("OtherProduct", 11, costumer);
        Purchase purchase3 = new Purchase("OneMoreProduct", 12, costumer);

        session.persist(costumer);

        session.persist(purchase1);
        session.persist(purchase2);
        session.persist(purchase3);

        transaction.commit();
        session.close();
    }

    public static void oneToOneExample(SessionFactory sessionFactory){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Human human1 =new Human("001", "Alpha", 92);
        Human human2 =new Human("032", "Beta", 52);
        Human human3 =new Human("012", "1.0", 25);
        Human human4 =new Human("002", "2.12", 12);

        Life life1 = new Life(1, "useless", human1);
        Life life2 = new Life(2, "useless", human2);
        Life life3 = new Life(3, "useless", human3);
        Life life4 = new Life(4, "useless", human4);

        human1.setHumanLife(life1);
        human2.setHumanLife(life2);
        human3.setHumanLife(life3);
        human4.setHumanLife(life4);

        session.persist(human1);
        session.persist(human2);
        session.persist(human3);
        session.persist(human4);

        transaction.commit();
        session.close();
    }

    public static void manyToManyExample(SessionFactory sessionFactory){
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
