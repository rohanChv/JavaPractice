package com.example.JPAPartOne.service;

import com.example.JPAPartOne.model.User;
import com.example.JPAPartOne.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    Logger logger=Logger.getLogger("UserService.class");

    public User findByName(String name){
        logger.info("Sending "+name);
        return userRepository.findByFirstName(name);
    }

    public void addUser(User user){
        userRepository.save(user);
        logger.info("USER SAVED");
    }

    public void addUserList(List<User> userList){
        userRepository.saveAll(userList);
        logger.info("USER SAVED");
    }

    public List<User> getUsersList(String country){
        return userRepository.getUserDetailsByCountry(country);
    }

    public List<User> getUsersByList(List<String> country){
        return userRepository.getUserDetailsByCountryList(country);
    }
    public List<User> getUserLike(String inputString){
        String s="%";
        s=s.concat(inputString).concat("%");
        return userRepository.findByFirstNameLike(s);
    }
}
