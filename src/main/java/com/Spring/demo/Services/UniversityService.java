package com.Spring.demo.Services;

import com.Spring.demo.Daos.UniversityDao;
import com.Spring.demo.Entities.Institute;
import com.Spring.demo.Entities.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UniversityService {
    @Autowired
    private UniversityDao universityDao;

    @Transactional
    public void addInstitute( University university, Institute institute){
        universityDao.addInstitute(university, institute);
    }

    @Transactional
    public void removeInstitute( University university, Institute institute){
        universityDao.removeInstitute(university, institute);
    }

    @Transactional
    public List<Institute> getAllInstitutes(University university){
        return universityDao.getAllInstitutes(university);
    }
}
