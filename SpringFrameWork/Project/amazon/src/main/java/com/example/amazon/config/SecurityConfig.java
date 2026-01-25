package com.example.amazon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(
                (auth)->auth.antMatchers("/addItems","/GetByID/**").hasAuthority("ADMIN")
                        .anyRequest().authenticated()
        ).httpBasic();
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails customer=User.builder().username("customer").password(passwordEncoder().encode("1234")).authorities("USER").build();
        UserDetails Admin=User.builder().username("admin").password(passwordEncoder().encode("ad1234")).authorities("ADMIN").build();
        return new InMemoryUserDetailsManager(customer,Admin);
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
