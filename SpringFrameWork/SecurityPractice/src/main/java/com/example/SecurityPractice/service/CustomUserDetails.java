package com.example.SecurityPractice.service;

import com.example.SecurityPractice.model.User;
import com.example.SecurityPractice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomUserDetails implements UserDetailsService {
    @Autowired
    UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u=userRepo.findByUserName(username);
        System.out.println(u.getRoles());
        return new org.springframework.security.core.userdetails.User(username, u.getPassword(), list(u.getRoles()));
    }
    public List<GrantedAuthority> list(String s){
        List<GrantedAuthority> li=new ArrayList<>();
        li.add(new SimpleGrantedAuthority("ROLE_"+s));
        return li;
    }
}
