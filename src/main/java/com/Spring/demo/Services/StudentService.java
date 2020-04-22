package com.Spring.demo.Services;

import com.Spring.demo.Daos.StudentDao;
import com.Spring.demo.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void save(Student student) {
        studentDao.save(student);
    }
}
