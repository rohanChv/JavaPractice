package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="application")
@Getter
@Setter
@Component
public class AppConfig {
    String name;
    Integer port;
}
