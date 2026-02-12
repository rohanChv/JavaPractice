package com.example.demo.config;

import com.example.demo.dto.requestDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Jconfig {

    @Bean(name = "CHAMP")
    public requestDTO getReq(){
        return new requestDTO();
    }


}
