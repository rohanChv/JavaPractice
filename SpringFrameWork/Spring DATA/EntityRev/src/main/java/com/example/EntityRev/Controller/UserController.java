package com.example.EntityRev.Controller;

import com.example.EntityRev.model.User;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@RestController
public class UserController {

    @PersistenceContext
    EntityManager em;

    @GetMapping("/getUserById/{Id}")
    public User getUserById(@PathVariable("Id")Integer id){
        return em.find(User.class,id);
    }

    @PostMapping("/postUser")
    @Transactional
    public void postUser(@RequestBody User user){
        em.persist(user);
    }

    @GetMapping("/getUser")
    public User postUser(){
        return new User();
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id")Integer id){
        em.remove(em.find(User.class,id));
        System.out.println("REMOVED");
    }

    @PutMapping("/updateUser/{id}/{country}")
    @Transactional
    public int updateUser(@PathVariable("id")Integer id,@PathVariable("country")String country){
        String jql="update User u set u.country=:country where u.id=:id";
        Query query=em.createQuery(jql);
        query.setParameter("country",country);
        query.setParameter("id",id);
        return query.executeUpdate();
    }

}
