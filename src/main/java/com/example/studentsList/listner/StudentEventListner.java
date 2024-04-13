package com.example.studentsList.listner;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentEventListner {

    @EventListener
    public void eventAdd(StudentEvent studentEvent){
        System.out.println( studentEvent.getTypeEventStudent().toString());
    }

}
