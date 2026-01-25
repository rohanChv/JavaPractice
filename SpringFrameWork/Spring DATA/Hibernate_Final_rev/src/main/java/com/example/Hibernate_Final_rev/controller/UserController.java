package com.example.Hibernate_Final_rev.controller;

import com.example.Hibernate_Final_rev.config.HibernateUtil;
import com.example.Hibernate_Final_rev.model.DBUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/addUser")
    public void addUser(){
        DBUser u=new DBUser(null,"CHAMPU");
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session s= sf.openSession();
        s.beginTransaction();
        s.save(u);
        s.getTransaction().commit();
        s.close();
    }
}
