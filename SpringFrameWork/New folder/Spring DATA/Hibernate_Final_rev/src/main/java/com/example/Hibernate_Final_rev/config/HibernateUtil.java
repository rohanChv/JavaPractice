package com.example.Hibernate_Final_rev.config;

import com.example.Hibernate_Final_rev.model.DBUser;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if(sessionFactory==null){
            Configuration cfg=new Configuration();
            cfg.addAnnotatedClass(DBUser.class);
            cfg.configure("hibernate.cfg.xml");
            sessionFactory=cfg.buildSessionFactory();
        }
        return sessionFactory;
    }
}
