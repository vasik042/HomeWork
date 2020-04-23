package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(generator = "gen")
    int id;
    @Column
    String name;
    @Column
    String surname;
    @Column
    String age;
    @Column
    private String fileName;
    @Column
    private String fileType;
    @Lob
    private byte[] data;


    public Student(String name, String surname, String age, String fileName, String fileType, byte[] data) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }

    public Student(){}

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
