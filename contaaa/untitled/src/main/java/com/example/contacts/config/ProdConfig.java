package com.example.contacts.config;

import com.example.contacts.initModule.DefInit;
import com.example.contacts.initModule.RunInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-prod.properties")
@Profile("prod")

public class ProdConfig {
    @Bean
    public RunInterface runInterface(){
        return new DefInit();
    }

}


