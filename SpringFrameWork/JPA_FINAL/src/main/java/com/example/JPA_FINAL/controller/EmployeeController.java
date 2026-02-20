package com.example.JPA_FINAL.controller;


import com.example.JPA_FINAL.model.AccessCard;
import com.example.JPA_FINAL.model.Employee;
import com.example.JPA_FINAL.repo.AccessRepo;
import com.example.JPA_FINAL.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    AccessRepo accessRepo;

    @PostMapping("/addEmployee")
    public void postUser(@RequestBody List<Employee> emp){
        employeeRepo.saveAllAndFlush(emp);
    }

    @PostMapping("/addId/{empId}")
    public void postUser(@RequestBody AccessCard accessCard, @PathVariable("empId")Integer empId){
        Optional<Employee> emp= employeeRepo.findById(empId);
            if(emp.isPresent()){
                emp.get().setAccessCard(accessCard);
                //accessRepo.save(accessCard);
                employeeRepo.save(emp.get());
            }
    }
    @GetMapping("/GetData/{offset}/{limit}")
    public List<Employee> getEmpData(@PathVariable("offset") Integer off,@PathVariable("limit")Integer limit){
       return employeeRepo.findAll();
    }

    @DeleteMapping("/remove/{id}")
    public void getEmpData(@PathVariable("id") Integer id){
        Employee emp=employeeRepo.findById(id).get();
        employeeRepo.delete(emp);
    }

}
