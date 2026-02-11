package com.example.SecurityPractice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.SecurityPractice.service.CustomUserDetails;

@Configuration
public class SecurityConfig {

    @Autowired
    CustomUserDetails customUserDetails;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests((auth)->{
            auth.antMatchers("/admin/authenticate/**").permitAll()
                    .anyRequest().authenticated();
        }).csrf().disable().formLogin().disable().httpBasic().disable();
        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception{
        AuthenticationManagerBuilder auth=http.getSharedObject(AuthenticationManagerBuilder.class);
        auth.userDetailsService(customUserDetails).passwordEncoder(passwordEncoder());
        System.out.println("BUILDING AUTH");
        return auth.build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
