package com.Spring.demo.Services;

import com.Spring.demo.Daos.InstituteDao;
import com.Spring.demo.Daos.UniversityDao;
import com.Spring.demo.Entities.Institute;
import com.Spring.demo.Entities.Student;
import com.Spring.demo.Entities.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class InstituteService {
    @Autowired
    private InstituteDao instituteDao;

    @Transactional
    public void addStudent(Institute institute, Student student){
        instituteDao.addStudent(institute, student);
    }

    @Transactional
    public void removeStudent(Institute institute, Student student){
        instituteDao.removeStudent(institute, student);
    }

    @Transactional
    public List<Student> getAllStudents(Institute institute){
        return instituteDao.getAllStudents(institute);
    }
}