package com.example.demo.Services;

import com.example.demo.Daos.StudentDao;
import com.example.demo.Entity.Student;
import com.example.demo.Entity.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

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

    public Student save(StudentRequest studentRequest,  MultipartFile file) {
        try {
            return studentDao.save(new Student(studentRequest.getName(), studentRequest.getSurname(), studentRequest.getAge(), StringUtils.cleanPath(file.getOriginalFilename()), file.getContentType(), file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Student getStudent(int id){
        return studentDao.getOne(id);
    }

    public List<Student> getAll(){
        return studentDao.findAll();
    }

    public void delete (int id){
        studentDao.deleteById(id);
    }
}
