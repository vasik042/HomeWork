package com.Spring.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="student_id")
    int id;
    @Column
    String name;
    @Column
    int age;

    @ManyToOne
    @JoinColumn(name="institute_id", nullable=false)
    private Institute institute;

    public Student(){

    }

    public Student(String name, int age, Institute institute) {
        this.name = name;
        this.age = age;
        this.institute = institute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }
}
