package com.example.one2one.controller;

import com.example.one2one.model.Applicant;
import com.example.one2one.repo.ApplicationRepo;
import com.example.one2one.repo.ResumeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobApplicationController {

    @Autowired
    ResumeRepo resumeRepo;

    @Autowired
    ApplicationRepo applicationRepo;

    @PostMapping("/addApplication")
    public void addApplication(@RequestBody Applicant applicant){
        System.out.println("SAVING DETAILS");
        applicationRepo.save(applicant);
    }
    @GetMapping("/getNewObject")
    public Applicant getNewObject(){
        return new Applicant();
    }

    @GetMapping("/getByResumeId/{id}")
    public Applicant getByResumeId(@PathVariable("id") Integer id){
        return resumeRepo.findById(id).get().getApplicant();
    }

}
