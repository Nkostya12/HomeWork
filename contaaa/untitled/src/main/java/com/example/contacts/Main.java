package com.example.contacts;

import com.example.contacts.config.AppConfig;
import com.example.contacts.initModule.ProfileChege;
import com.example.contacts.service.ComandRun;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.getBean(ProfileChege.class).go();
        ComandRun runConsole = context.getBean(ComandRun.class);

        runConsole.consoveActive();

    }
}
