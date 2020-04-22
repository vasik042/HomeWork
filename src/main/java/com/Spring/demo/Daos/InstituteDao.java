package com.Spring.demo.Daos;

import com.Spring.demo.Entities.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituteDao extends JpaRepository<Institute, Integer> {

}