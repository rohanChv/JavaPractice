package com.example.HIBERNATE.controller;

import com.example.HIBERNATE.config.HibernateUtil;
import com.example.HIBERNATE.model.Stock;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Query;
import java.util.List;

@RestController
public class Cont {

    @GetMapping("/addData")
    public void addData(){
        HibernateUtil util=new HibernateUtil();
        SessionFactory sessionFactory= util.getSessionFactory();
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        for(int i=0;i<5000;i++){
            session.save(new Stock(i,"ITEM"+i,(i*3)));
        }
        session.getTransaction().commit();
    }
    @GetMapping("/getData")
    public List<Stock> getData(){
        HibernateUtil util=new HibernateUtil();
        SessionFactory sf= util.getSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        Query q =s.createQuery("select itemStock from Stock where itemStock>:itemStock");
       
        q.setParameter("itemStock",4500);
        return q.getResultList();
    }

}
