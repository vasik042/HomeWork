package com.Spring.demo.Services;

import com.Spring.demo.Daos.InstituteDao;
import com.Spring.demo.Entities.Institute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstituteService {

    private InstituteDao instituteDao;

    @Autowired
    public InstituteService(InstituteDao instituteDao) {
        this.instituteDao = instituteDao;
    }

    public void save(Institute institute) {
        instituteDao.save(institute);
    }
}