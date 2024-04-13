package com.example.studentsList.Servese;

import com.example.studentsList.listner.StudentEvent;
import com.example.studentsList.listner.TypeEventStudent;
import com.example.studentsList.model.Student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.*;

@ShellComponent
public class CommandSevece {



    private final List<Student> listStudent;

    private final ApplicationEventPublisher publisher;

    private boolean isEmpty;


    public CommandSevece(ApplicationEventPublisher publisher,  @Value("${isEmpty}") boolean isEmpty) {

        this.publisher = publisher;
        listStudent = new ArrayList<>();
        this.isEmpty = isEmpty;

        if (!isEmpty) {
            listStudent.add(new Student(1, "ivan", "ivanov", 22));
            listStudent.add(new Student(2, "sidor", "sidorov", 29));
            listStudent.add(new Student(3, "anton", "antonov", 40));
        }

    }

    @ShellMethod
    public Student add(String firstName, String lastName, int age) {
        Student student = new Student(new Random().nextInt(1001), firstName, lastName, age);


        listStudent.add(student);
        publisher.publishEvent(new StudentEvent(student, TypeEventStudent.ADD));
        return student;
    }

    @ShellMethod
    public List<Student> show() {
        publisher.publishEvent(new StudentEvent(listStudent, TypeEventStudent.SHOW_ALL));
        return listStudent;
    }

    @ShellMethod
    public Optional<Boolean> remove(Integer id) {
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
