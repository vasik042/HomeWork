package com.Spring.demo.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "institute")
public class Institute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "institute_id")
    int id;
    @Column
    private String name;

    @OneToMany(mappedBy = "institute")
    private List<Student> students;

    @ManyToOne
    @JoinColumn(name="university_id", nullable=false)
    private University university;

    public Institute(){

    }

    public Institute(String name, University university){
        this.name = name;
        this.students = new ArrayList<>();
        this.university = university;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
