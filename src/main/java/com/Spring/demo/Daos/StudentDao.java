package com.Spring.demo.Daos;

import com.Spring.demo.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
    @Override
    <S extends Student> S save(S s);
}
