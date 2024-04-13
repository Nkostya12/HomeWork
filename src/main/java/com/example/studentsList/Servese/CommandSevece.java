package com.example.studentsList.Servese;

import com.example.studentsList.listner.StudentEvent;
import com.example.studentsList.listner.TypeEventStudent;
import com.example.studentsList.model.Student;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.*;

@ShellComponent
public class CommandSevece {


    private List<Student> listStudent = new ArrayList<>();

    private final ApplicationEventPublisher publisher;


    public CommandSevece(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @ShellMethod
    public Student add(String firstName, String lastName, int age) {
        Student student = new Student(new Random().nextInt(1001), firstName, lastName, age);
        listStudent.add(student);
        publisher.publishEvent(new StudentEvent(student, TypeEventStudent.ADD));
        return student;
    }

    @ShellMethod
    public List show() {
        publisher.publishEvent(new StudentEvent(listStudent, TypeEventStudent.SHOW_ALL));
        return listStudent;
    }

    @ShellMethod
    public Optional remove(Integer id) {
        publisher.publishEvent(new StudentEvent(id, TypeEventStudent.DELETE));
        return listStudent.stream().filter(student -> student.getId() == id).
                findAny().map(studentAny -> listStudent.remove(studentAny));
    }

    @ShellMethod
    public String clean() {
        listStudent.clear();
        publisher.publishEvent(new StudentEvent(null, TypeEventStudent.DELETE));
        return listStudent.toString();
    }


}
