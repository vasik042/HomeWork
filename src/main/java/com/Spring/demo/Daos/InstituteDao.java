package com.Spring.demo.Daos;

import com.Spring.demo.Entities.Institute;
import com.Spring.demo.Entities.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InstituteDao {

    public InstituteDao(){
    }

    public void addStudent(Institute institute, Student student){
        institute.getStudents().add(student);
    }

    public void removeStudent(Institute institute, Student student){
        institute.getStudents().remove(student);
    }

    public List<Student> getAllStudents(Institute institute){
        return institute.getStudents();
    }
}
