package com.example.Scopes1.Config;

import com.example.Scopes1.Service.PrototypeClass;
import com.example.Scopes1.Service.ServiceClass;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public ServiceClass getService(){
        return new ServiceClass("Default Service");
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public PrototypeClass getProto(){
        return new PrototypeClass("Default Prototype");
    }
}
