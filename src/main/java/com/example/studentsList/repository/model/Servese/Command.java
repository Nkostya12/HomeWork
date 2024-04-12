package com.example.studentsList.repository.model.Servese;

import com.example.studentsList.repository.model.Student;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import java.util.ArrayList;
import java.util.List;

@ShellComponent
public class Command {


    private List<Student> listStudent = new ArrayList<>();

    @ShellMethod
    public void add(String firstName, String lastName, int age) {
        new Student(firstName, lastName, age);
    }

    @ShellMethod
    public  String vi(){
        return listStudent.toString();
    }
}
