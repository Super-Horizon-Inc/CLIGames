package util;

import core.model.MainCharacter;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import core.model.Character;
import core.model.Weapon;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

    public static void main(String[] args) {

        getSessionFactory();

//        // obtains the session
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        // write our test code
//        Weapon weapon = session.find(Weapon.class,12);
//        Character main = session.find(Character.class,9);
//        main.setWeapon(weapon);
//        session.save(main);
//        session.getTransaction().commit();
//        shutdown();
    }
}
