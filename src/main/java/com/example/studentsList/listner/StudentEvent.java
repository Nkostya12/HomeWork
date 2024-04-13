package com.example.studentsList.listner;

import org.springframework.context.ApplicationEvent;

public class StudentEvent extends ApplicationEvent {

    private final TypeEventStudent typeEventStudent;
    public StudentEvent(Object source, TypeEventStudent typeEventStudent) {
        super(source);
        this.typeEventStudent = typeEventStudent;
    }


    public TypeEventStudent getTypeEventStudent() {
        return typeEventStudent;
    }
}
