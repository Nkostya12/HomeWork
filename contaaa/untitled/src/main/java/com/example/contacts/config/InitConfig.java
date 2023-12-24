package com.example.contacts.config;

import com.example.contacts.initModule.InitInit;
import com.example.contacts.initModule.RunInterface;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application-init.properties")
@Profile("init")
public class InitConfig {


    @Bean
    public RunInterface runInterface(){
        return new InitInit();
    }
}
