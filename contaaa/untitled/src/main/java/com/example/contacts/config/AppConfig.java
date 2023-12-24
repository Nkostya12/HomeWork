package com.example.contacts.config;

import org.springframework.context.annotation.*;



@ComponentScan("com.example")
@Configuration
@PropertySource("classpath:application.properties")

public class AppConfig {
}
