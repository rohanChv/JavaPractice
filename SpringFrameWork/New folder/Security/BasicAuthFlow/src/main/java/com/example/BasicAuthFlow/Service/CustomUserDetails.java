package com.example.BasicAuthFlow.Service;

import com.example.BasicAuthFlow.model.DBUser;
import com.example.BasicAuthFlow.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CustomUserDetails implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        DBUser user= userRepo.findByUserName(username);
        List<GrantedAuthority> list=new ArrayList<>();
        list.add(new SimpleGrantedAuthority(user.getRole()));
        return User.builder().username(user.getUserName()).password(user.getPassword()).authorities(list).build();
    }

}
