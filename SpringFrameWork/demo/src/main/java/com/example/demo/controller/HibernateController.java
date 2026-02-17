package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HibernateController {
    @GetMapping("/getAuthor")
    public Author getAuthor() throws Exception {
        HibernateUtil ut=new HibernateUtil();
        SessionFactory sf= ut.getSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        Author a=s.get(Author.class,2);
        System.out.println(a.toString());
        tx.commit();
        return a;
    }
    @GetMapping("/getStatusCodes")
    public String getCodes(){
        return "500->Internal server Error, 502->Bad Gateway,503->Service Unavailable,504->TimeoutError";
    }
}
