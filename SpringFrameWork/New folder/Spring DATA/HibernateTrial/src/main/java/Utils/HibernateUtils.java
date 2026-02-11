package Utils;

import model.HibernateTrial;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    static final SessionFactory sessionFactory;
    static {
        sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(HibernateTrial.class)
                .buildSessionFactory();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
