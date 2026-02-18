package com.example.demo.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.imageio.spi.ServiceRegistry;

public class HibernateUtil {

    private SessionFactory sessionFactory=null;

    public SessionFactory getSessionFactory(){

        if (sessionFactory==null){
            Configuration cfg=new Configuration()
                    .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                    .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres")
                    .setProperty("hibernate.connection.username", "postgres")
                    .setProperty("hibernate.connection.password", "root")
                    .setProperty("hibernate.show_sql","true")
                    .setProperty("hibernate.cache.use_second_level_cache","true")
                    .setProperty("hibernate.cache.use_query_cache","true")
                    .setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory")
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");

            cfg.addAnnotatedClass(com.example.demo.model.Product.class);
            StandardServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
            sessionFactory=cfg.buildSessionFactory(sr);
        }
        return sessionFactory;
    }
}
