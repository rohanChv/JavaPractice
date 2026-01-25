package com.example.SecurityPractice.service;

import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.example.SecurityPractice.model.DBUser;


import com.example.SecurityPractice.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetails implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        DBUser user=userRepo.findByUserName(username);
        return User.builder().username(user.getUserName()).password(user.getPassword()).authorities(getList(user.getRoles())).build();
    }

    public List<GrantedAuthority> getList(String s){

        List<GrantedAuthority> list=new ArrayList<>();
        list.add(new SimpleGrantedAuthority(s));
        return list;
    }

}
