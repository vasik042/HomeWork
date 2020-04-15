package com.Spring.demo.Entities;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String name;
    private List<Student> students;

    public Institute(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
