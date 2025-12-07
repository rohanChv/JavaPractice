package com.example.SpringbootBasic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Courses> getCourses(){

        return Arrays.asList(new Courses("Java","Rohan",1),
                new Courses("C++","Krishnan Aiiyer",4));
    }
}
