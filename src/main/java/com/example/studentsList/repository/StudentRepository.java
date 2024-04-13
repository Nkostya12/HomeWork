package com.example.studentsList.repository;

import com.example.studentsList.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class StudentRepository {


    private List<Student> listStudent = new ArrayList<>();

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
}
