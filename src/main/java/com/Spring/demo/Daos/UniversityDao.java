package com.Spring.demo.Daos;

import com.Spring.demo.Entities.Institute;
import com.Spring.demo.Entities.University;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UniversityDao {
    public UniversityDao(){
    }

    public void addInstitute( University university, Institute institute){
        university.getInstitutes().add(institute);
    }

    public void removeInstitute( University university, Institute institute){
        university.getInstitutes().remove(institute);
    }

    public List<Institute> getAllInstitutes(University university){
        return university.getInstitutes();
    }
}
