package com.Spring.demo.Services;

import com.Spring.demo.Daos.UniversityDao;
import com.Spring.demo.Entities.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

    private UniversityDao universityDao;

    @Autowired
    public UniversityService(UniversityDao universityDao) {
        this.universityDao = universityDao;
    }

    public void save(University university) {
        universityDao.save(university);
    }
}