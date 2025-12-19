package com.example.JPAPartOne.Controller;

import com.example.JPAPartOne.model.User;
import com.example.JPAPartOne.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("/getUser")
    public User addUser(){
        return new User();
    }

    @GetMapping("/findUserByName/{userName}")
    public User getByName(@PathVariable("userName") String userName){
        System.out.println("READ->"+userName);
        return userService.findByName(userName);
    }

    @PostMapping("/addMultipleUsers")
    public void addMultipleUsers(@RequestBody List<User> userList){
        userService.addUserList(userList);
    }

    @GetMapping("/getUsersByCountry/{country}")
    public List<User> getUsersByCountry(@PathVariable(name="country") String country){
        return userService.getUsersList(country);
    }
    @PostMapping("/getUsersFromCountries")
    public List<User> getUsersFromCountries(@RequestBody List<String> countryList){
       return userService.getUsersByList(countryList);
    }
    @GetMapping("/getUserLike/{inputString}")
    public List<User> getUserLike(@PathVariable(value="inputString") String inputString){
        return userService.getUserLike(inputString);
    }
}
