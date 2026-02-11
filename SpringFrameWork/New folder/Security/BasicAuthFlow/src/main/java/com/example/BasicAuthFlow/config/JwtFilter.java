package com.example.BasicAuthFlow.config;

import com.example.BasicAuthFlow.Service.CustomUserDetails;
import com.example.BasicAuthFlow.Service.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    JWTUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        final String auth=request.getHeader("Authorization");
        if(auth!=null){
            String s=auth.substring(7);
            String username=jwtUtil.getUsername(s);
            if(SecurityContextHolder.getContext()==null && !username.isEmpty() ){
                CustomUserDetails customUserDetails=new CustomUserDetails();
                UserDetails user=customUserDetails.loadUserByUsername(username);
                UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(user,null,user.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(token);
            }
        }

        filterChain.doFilter(request,response);

    }
}
