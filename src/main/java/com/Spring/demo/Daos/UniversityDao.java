package com.Spring.demo.Daos;

import com.Spring.demo.Entities.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityDao extends JpaRepository<University, Integer> {

}
