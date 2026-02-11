package com.example.EntityManager.patientController;

import com.example.EntityManager.model.Patient;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.*;
import java.util.logging.Logger;

@RestController
public class PatientController {

    @PersistenceContext
    private EntityManager em;

    @GetMapping("/addPatientTrial")
    @Transactional
    public void addPatient(){
        Patient p=new Patient("TRIAL","TIRAL","@GMAIL");
        em.persist(p);//persist and ADD because of transactional it will work
    }

    @GetMapping("/getByIDAndUpdateEmail/{key}/{newEmail}")
    @Transactional
    public void updatePatient(@PathVariable("key")int key,@PathVariable("newEmail")String newEmail){
        Logger logger= Logger.getLogger("PatientController.class");
        Patient p=em.find(Patient.class,key);
        logger.info(String.valueOf(em.contains(p)));
        p.setEmail(newEmail);
        em.detach(p);
        p.setEmail("UPDATED"+newEmail);
        em.merge(p);
    }

    @DeleteMapping("/removeById/{key}")
    @Transactional
    public void deletePatient(@PathVariable("key")int key){
        Patient p=em.find(Patient.class,key);
        em.remove(p);
    }

    @GetMapping("/getSubStrings/{string}")
    public List<String> getSubStrings(@PathVariable("string")String s){
        List<String>stringList=new LinkedList<>();
        List<String>pallin=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();++j){
                StringBuilder sb2=new StringBuilder(s.substring(i,j));
                String comp=sb2.toString();
                String rev=sb2.reverse().toString();
                if(rev.equalsIgnoreCase(comp)){
                    pallin.add(rev);
                }
                stringList.add(sb2.toString());
            }
        }
        stringList.sort((a,b)->a.length()-b.length());
        pallin.sort((a,b)->b.length()-a.length());
        System.out.println(pallin.get(0));
        return pallin;
    }

    @GetMapping("/getById/{id}")
    public List<Patient> getByID(@PathVariable("id")Integer s){
        String jql="select p from Patient p where p.patientId=:id";
        TypedQuery<Patient> query =em.createQuery(jql, Patient.class);
        query.setParameter("id",s);
        return query.getResultList();
    }

}
