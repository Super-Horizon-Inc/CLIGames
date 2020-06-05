package util;

import core.model.*;
import core.model.Character;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

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

        // obtains the session
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();


//        // write our test code
//        Weapon weapon = session.find(Weapon.class,12);
//        Character main = session.find(Character.class,9);
//        main.setWeapon(weapon);
//        session.save(main);


//        // write our test code
//        Skill skill1 = new Skill();
//        Skill skill2 = new Skill();
//        Character char1 = new Character();
//        Character char2 = new Character();
//        char1.setSkill(skill1);
//        char1.setSkill(skill2);
//        char2.setSkill(skill1);
//        session.persist(char1);
//        session.persist(char2);


//        Character char1 = session.find(Character.class, 9);
//        Character char2 = session.find(Character.class, 13);
//
//        Map map1 = new Map();
//        Map map2 = new Map();
//
//        map1.setCharacter(char1);
//        map1.setCharacter(char2);
//
//        map2.setCharacter(char1);
//
//        session.persist(map1);
//        session.persist(map2);
//
//
//        // close up
//        session.getTransaction().commit();
//        shutdown();
    }
}
