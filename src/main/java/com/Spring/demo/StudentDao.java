package com.Spring.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class StudentDao {
    List<Student> students;

    StudentDao(){
        this.students = new ArrayList<>();
    }

    void addStudent(Student student){
        getStudents().add(student);
    }

    void removeStudent(Student student){
        getStudents().remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
