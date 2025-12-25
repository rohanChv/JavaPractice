package util;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    static final SessionFactory sessionFactory;

    static {

        sessionFactory= new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
