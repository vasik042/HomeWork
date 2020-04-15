package com.Spring.demo.Entities;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private String address;
    private String levelOfAccreditation;
    private List<Institute> institutes;

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

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", levelOfAccreditation='" + levelOfAccreditation + '\'' +
                ", institutes=" + institutes +
                '}';
    }
}
