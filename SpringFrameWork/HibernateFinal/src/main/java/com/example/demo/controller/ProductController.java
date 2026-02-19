package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/getAllProductList")
    public List<Product> getList(){
        HibernateUtil util=new HibernateUtil();
        Session s=util.getSessionFactory().openSession();
        String fecthQuery="FROM Product";
        return s.createQuery(fecthQuery).list();
    }

    @PostMapping("/postProducts")
    public void addProducts(@RequestBody Product prod){
        HibernateUtil util=new HibernateUtil();
        Session s=util.getSessionFactory().openSession();
        Transaction t=s.beginTransaction();
        s.save(prod);
        t.commit();
        s.close();
    }

    @GetMapping("/getTheProductDTO")
    public List<Product> getListDTO(){
        HibernateUtil util=new HibernateUtil();
        Session s=util.getSessionFactory().openSession();
        String fecthQuery="SELECT new com.example.demo.model.ProductDTO(p.productName,p.price)"+"FROM Product p";
        return s.createQuery(fecthQuery).list();
    }

}
