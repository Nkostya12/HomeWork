package com.example.contacts.initModule;
import org.springframework.stereotype.Component;


@Component
public class ProfileChege {

    private final RunInterface runInterface;
    public ProfileChege(RunInterface runInterface) {
        this.runInterface = runInterface;
    }

    public void go(){
        runInterface.init();
    }
}
