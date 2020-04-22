package com.Spring.demo.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id")
    int id;
    @Column
    private String name;
    @Column
    private String address;
    @Column (name="level_of_accreditation")
    private String levelOfAccreditation;

    @OneToMany(mappedBy = "university")
    private List<Institute> institutes;

    public University(){

    }

    public University(String name, String address, String levelOfAccreditation) {
        this.name = name;
        this.address = address;
        this.levelOfAccreditation = levelOfAccreditation;
        this.institutes = new ArrayList<>();
    }

    public void addInstitute(Institute institute){
        this.institutes.add(institute);
    }

    public void removeInstitute(Institute institute){
        this.institutes.remove(institute);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLevelOfAccreditation() {
        return levelOfAccreditation;
    }

    public void setLevelOfAccreditation(String levelOfAccreditation) {
        this.levelOfAccreditation = levelOfAccreditation;
    }

    public int getNumberOfInstitutes() {
        return this.institutes.size();
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    public void setInstitutes(List<Institute> institutes) {
        this.institutes = institutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
